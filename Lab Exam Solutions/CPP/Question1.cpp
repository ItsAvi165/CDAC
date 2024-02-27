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
};

//Main method to test the functions of Room class
int main() {
    // Creating Room objects
    Room room1;
    Room room2(102,"HR Room",30,70.50);



    // Setting attributes for room1 using setters
    room1.setRoomId(11);
    room1.setRoomId(102);
    room1.setRoomName("Meeting Room");
    room1.setNumberOfSeats(15);
    room1.setPricePerSeat(12.75);


    // Testing getter methods
    cout << "Room 1 ID: " << room1.getRoomId() << endl;
    cout << "Room 1 Name: " << room1.getRoomName() << endl;
    cout << "Room 1 Seats: " << room1.getNumberOfSeats() << endl;
    cout << "Room 1 Price per Seat: " << room1.getPricePerSeat() << endl;


    // Testing calculate total price method 
    cout << "\nTotal price for Room 1: " << room1.calculateTotalPrice() << endl;
    cout<<"--------------------------------------------------------------------------------------------------"<<endl;

    // Testing display room details method 
    cout << "\nRoom 2 Details:" << endl;
    room2.displayRoomDetails();
    cout<<"--------------------------------------------------------------------------------------------------"<<endl;
    return 0;   //end of the main method
}
