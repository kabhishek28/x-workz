package com.xworkz.IsARelation.runner;

import com.xworkz.IsARelation.external.LuxuryHotel;
import com.xworkz.IsARelation.internal.Hotel;

public class LuxuryHotelRunner {

    public static  void main(String[] args) {
        Hotel hotel1 = new Hotel();
        hotel1.checkIn();
        hotel1.checkOut();
        hotel1.provideRoomService();
        hotel1.manageBookings();
        hotel1.cleanRooms();
        System.out.println("-----------");
        Hotel hotel = new LuxuryHotel();
        hotel.checkIn();
        hotel.checkOut();
        hotel.provideRoomService();
        hotel.manageBookings();
        hotel.cleanRooms();
        System.out.println("-----------");
        LuxuryHotel luxuryHotel = new LuxuryHotel();
        luxuryHotel.checkIn();
        luxuryHotel.checkOut();
        luxuryHotel.provideRoomService();
        luxuryHotel.manageBookings();
        luxuryHotel.cleanRooms();


    }
}
