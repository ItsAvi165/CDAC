#include <iostream>
#include <bits/stdc++.h>
using namespace std;

//class created with its data members
class Room {
private:
    int room_id;
    string room_name;
    int number_of_seats;
    double price_per_seat;

public:
    // Parameterless Constructor
    Room() : room_id(0), room_name(""), number_of_seats(0), price_per_seat(0.0) {}
    
    //Parameterized constructor
    Room(int id, string name, int seats, double price)
        : room_id(id), room_name(name), number_of_seats(seats), price_per_seat(price) {}


    // Getter methods for all the data members of Room class
    int getRoomId()  {
        return room_id;
    }

    string getRoomName() {
        return room_name;
    }

    int getNumberOfSeats()  {
        return number_of_seats;
    }

    double getPricePerSeat() {
        return price_per_seat;
    }



    // Setter methods for all the data members of Room class
    void setRoomId(int id) {
        room_id = id;
    }

    void setRoomName(string name) {
        room_name = name;
    }

    void setNumberOfSeats(int seats) {
        number_of_seats = seats;
    }

    void setPricePerSeat(double price) {
        price_per_seat = price;
    }



    // Method to calculate total price of a room based on number of seats and price per seat
    double calculateTotalPrice() {
        return number_of_seats * price_per_seat;
    }


    //Method to display all the details of a Room
    void displayRoomDetails() {
        cout << "Room ID: " << room_id << "\n";
        cout << "Room Name: " << room_name << "\n";
        cout << "Number of Seats: " << number_of_seats << "\n";
        cout << "Price per Seat: " << price_per_seat << "\n";
        cout << "Total Price: " << calculateTotalPrice() << "\n";
    }


    //Method to add New Room by taking room details as user input
    void addNewRoom(){
        cout<<"--------------------------------------------------------------------------------------------------"<<endl;
        cout<<"Enter room details as per following order:"<<endl;
        cout<<"1.Room Id\n2.Room Name\n3.Number of seats\n4.Price per seat\n";
        cin>>room_id;
        cin>>room_name;
        cin>>number_of_seats;
        cin>>price_per_seat;
        cout<<"--------------------------------------------------------------------------------------------------"<<endl;
    }
};

//Main method to test the functions of Room class
int main() {

    // Creating Array of Room objects to store 10 room details
    Room rooms[10];

    //Taking room details from the user via addNewRoom() method
    for(int i=0;i<10;i++){
        rooms[i].addNewRoom();
    }


    int number_of_students;  //variable to take number of students as input from the user
    cout<<"Enter number of students to find suitable room with its total amount: "<<endl;
    cin>>number_of_students;


    //Traversing all the room details and finding out suitable rooms with room capacity>= number of students
    //and printing the total amount for such suitable rooms
    for(int i=0;i<10;i++){
        if(rooms[i].getNumberOfSeats() >= number_of_students){
            cout<<"The suitable room is: "<<rooms[i].getRoomName()<<endl;
            cout<<"Total amount = "<<rooms[i].getPricePerSeat()*number_of_students<<endl; 
        }
    }
    return 0;
}
