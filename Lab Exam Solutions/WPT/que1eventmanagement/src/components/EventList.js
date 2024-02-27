import React, { Component } from "react";
import EventDetails from "./EventDetails";
import EventService from "../service/EventService";
import EventForm from "./EventForm";
export default class EventList extends Component {
  constructor(props) {
    super(props);
    console.log("in productList constructor");
    this.state = {
      eventarr: [],
      searcharr: [],
      flag: false,
      upprod: {},
    };
  }
  //this method gets called only once in the lifetime of component,
  //so better place to initialize the state, use API
  //useEffect(()=>{},[])  //empty array useEffect is equivalent to componentDidMount
  componentDidMount() {
    console.log("in productList componentDidMount");
    //the data will retrieved from EventService and initialize both arrays
    this.setState({
      ...this.state,
      eventarr: EventService.getallevents(),
      searcharr: EventService.getallevents(),
    });
  }
  changeflag = () => {
    this.setState({ ...this.state, flag: true, upprod: {} });
  };
  resetflag = () => {
    this.setState({ ...this.state, flag: false });
  };
  editeventdata = (prod) => {
    this.setState({ ...this.state, flag: true, upprod: { ...prod } });
  };
  render() {
    return (
      <div className="container">
        <div className="row">
          <div className="col-md-12">
            <br></br>
            <button
              type="button"
              name="btn"
              id="btn"
              className="btn btn-info"
              onClick={this.changeflag}
            >
              Add Event
            </button>
            <br></br>
            <br></br>
            <h1>Event List</h1>
            <br></br>
            <br></br>
            <div>
              <span>
                <h3>Title &nbsp;&nbsp;Description &nbsp;&nbsp;DueDate</h3>
              </span>
            </div>
            {/* <table style={{ width: "90%" }}>
              <tr>
                <th>Event Title</th>
                <th>Event Description</th>
                <th>Event Due Date</th>
              </tr>
            </table> */}
            {this.state.searcharr.map((eve) => (
              <EventDetails
                key={eve.title}
                event={eve}
                modifyevent={this.editeventdata}
              ></EventDetails>
            ))}
          </div>
        </div>
        <div className="row">
          {this.state.flag ? (
            <EventForm
              chflag={this.resetflag}
              editevent={this.state.upprod}
            ></EventForm>
          ) : (
            ""
          )}
        </div>
      </div>
    );
  }
}
