package com.bridgelabz;

public class Hotels {
    private String hotelName;
    private int weekDayRate;

    public Hotels(String hotelName, int weekDayRate) {
        this.hotelName = hotelName;
        this.weekDayRate = weekDayRate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getWeekDayRate() {
        return weekDayRate;
    }

    public void setWeekDayRate(int weekDayRate) {
        this.weekDayRate = weekDayRate;
    }
}
