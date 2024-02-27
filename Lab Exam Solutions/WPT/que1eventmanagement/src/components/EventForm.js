import React, { useState, useEffect } from "react";
import EventService from "../service/EventService";
export default function EventForm(props) {
  const [formdetails, setformdetails] = useState({
    title: "",
    desc: "",
    duedate: "",
  });
  const [formerrors, seterrors] = useState({});
  useEffect(() => {
    console.log("in useEffect edit form");
    if (props.editevent.title !== undefined)
      setformdetails({ ...props.editevent });
  }, [props.editevent]);
  const validateForm = () => {
    let errors = {};
    if (
      //props.editevent.title === undefined &&
      formdetails.title.trim().length === 0
    ) {
      errors.titleerr = "title cannot be empty";
    }
    // if (formdetails.duedate < 0) {
    //   errors.duedateerr = "quantity cannot be negative";
    // }
    seterrors(errors);
    return errors;
  };
  const addevent = () => {
    var errors = validateForm();
    if (Object.keys(errors).length > 0) {
      //we don't want to add object
      return;
    } else {
      //add the object in the array
      EventService.insertEvent(formdetails);
      //clearing the form
      setformdetails({ title: "", desc: "", duedate: "" });
      //to hide the form
      props.chflag();
    }
  };
  const handlechange = (event) => {
    //let name=event.target.name;
    //let value=event.target.value;
    //this is equivalent to previous 2 lines
    //it will retrieve name property of event.target assign it to name variable, also retrieve value property and assign to value variable
    let { name, value } = event.target;
    setformdetails({ ...formdetails, [name]: value });
  };
  const updateevent = () => {
    var errors = validateForm();
    if (Object.keys(errors).length > 0) {
      //we don't want to add object
      return;
    } else {
      //add the object in the array
      EventService.updateEvent(formdetails);
      //clearing the form
      setformdetails({ title: "", desc: "", duedate: "" });
      //to hide the form
      props.chflag();
    }
  };
  return (
    <div>
      <form>
        <div className="form-group">
          <label htmlFor="title">Event Title</label>
          <input
            type="text"
            className="form-control"
            id="title"
            name="title"
            value={formdetails.title}
            onChange={handlechange}
          />
          <p>{formerrors.titleerr}</p>
        </div>
        <div className="form-group">
          <label htmlFor="desc">Description</label>
          <input
            type="text"
            className="form-control"
            id="desc"
            name="desc"
            value={formdetails.desc}
            onChange={handlechange}
          />
        </div>
        <div className="form-group">
          <label htmlFor="duedate">Due Date</label>
          <input
            type="date"
            className="form-control"
            id="duedate"
            name="duedate"
            value={formdetails.duedate}
            onChange={handlechange}
          />
          <p>{formerrors.titleerr}</p>
        </div>
        {/* <div className="form-group">
          <label htmlFor="price">Product Price</label>
          <input
            type="text"
            className="form-control"
            id="price"
            name="price"
            value={formdetails.price}
            onChange={handlechange}
          />
        </div> */}

        {props.editevent.title === undefined ? (
          <button
            type="button"
            className="btn btn-primary"
            id="add"
            name="add"
            onClick={addevent}
          >
            Add Event
          </button>
        ) : (
          <button
            type="button"
            className="btn btn-primary"
            id="add"
            name="add"
            onClick={updateevent}
          >
            Update Event
          </button>
        )}
      </form>
    </div>
  );
}
