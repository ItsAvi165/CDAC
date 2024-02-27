const express = require("express");
var router = express.Router();
var connection = require("../db/dbconnect");
eventarr=[{title:"Indian Idol",desc:'singing',duedate:"2024-01-14"},
        {{title:"Dance+",desc:'dancing',duedate:"2024-01-26"}];

//retrieve all events and return in json format
router.get("/list", function (req, resp) {
    const events = JSON.stringify([eventarr]);
    resp.send(events)
});

//add new event received via request body and add it in the database
router.post("/new", function (req, resp) {
    const data = req.body;
    const newevent = {title:data.title,desc:data.desc,duedate:data.duedate};
    eventarr.push(newevent)
});
//this is same object rotes in app.js
module.exports = router;
