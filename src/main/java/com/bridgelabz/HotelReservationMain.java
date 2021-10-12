package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelReservationMain {
    List<Hotels> hotels = new ArrayList<>();

    //This method is used to add hotel to the Hotel List

    public boolean addHotel(Hotels hotelName) {
        return hotels.add(hotelName);
    }



    public static void main(String[] args){
        System.out.println("Welcome To The Hotel Reservation Program");
    }
}
