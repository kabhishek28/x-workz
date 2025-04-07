package com.xworkz.IsARelation.casting;

import com.xworkz.IsARelation.external.LuxuryHotel;
import com.xworkz.IsARelation.internal.Hotel;

public class HotelServiceHandler {

        public HotelServiceHandler() {
            System.out.println("HotelServiceHandler Constructor");
        }

        public void handleHotel(Hotel hotel) {
            if (hotel != null) {
                hotel.checkIn();
                hotel.checkOut();
                hotel.provideRoomService();
                hotel.manageBookings();
                hotel.cleanRooms();

                if (hotel instanceof LuxuryHotel) {
                    LuxuryHotel luxuryHotel = (LuxuryHotel) hotel;
                    luxuryHotel.provideSpaServices(); // subclass specific method
                } else {
                    System.out.println("The given hotel is not a LuxuryHotel.");
                }
            }
        }


}
