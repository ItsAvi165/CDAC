import { Event } from "../Event";
class EventService {
  constructor() {
    this.eventarr = [
      new Event("Indian Idol", "Singing", "2024-01-15"),
      new Event("DID", "Dancing", "2024-01-25"),
    ];
  }
  getallevents() {
    return this.eventarr;
  }
  insertEvent(e) {
    this.eventarr.push(new Event(e.title, e.desc, e.duedate));
  }
  deleteProduct(title) {
    console.log("in delete product in product service");
    let pos = this.eventarr.findIndex((p) => p.title === title);
    this.eventarr.splice(pos, 1);
    console.log(this.eventarr);
  }
  updateEvent(e) {
    let pos = this.eventarr.findIndex((e1) => e1.title === e.title);
    this.eventarr.splice(pos, 1, new Event(e.title, e.desc, e.duedate));
  }
}
export default new EventService();
