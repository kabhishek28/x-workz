package com.xworkz.IsARelation.external;

import com.xworkz.IsARelation.internal.Hotel;

public class LuxuryHotel extends Hotel {
    public LuxuryHotel() {
        System.out.println("LuxuryHotel Constructor");
    }
@Override
    public void checkIn() {
        System.out.println("@Override :Hotel is checking in guests");
    }
    @Override
    public void checkOut() {
        System.out.println("@Override :Hotel is checking out guests");
    }
    @Override
    public void provideRoomService() {
        System.out.println("@Override :Hotel is providing room service");
    }
    @Override
    public void manageBookings() {
        System.out.println("@Override :Hotel is managing bookings");
    }
    @Override
    public void cleanRooms() {
        System.out.println("@Override :Hotel is cleaning rooms");
    }


    public void provideSpaServices() {
        System.out.println("LuxuryHotel is providing spa services to guests...");
    }

}
