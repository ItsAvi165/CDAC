import logo from "./logo.svg";
import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";
import Header from "./components/Header";
import Footer from "./components/Footer";
import EventList from "./components/EventList";
import EventForm from "./components/EventForm";
function App() {
  return (
    <div className="App">
      <Header></Header>
      <EventList> </EventList>
      <Footer></Footer>
    </div>
  );
}

export default App;
