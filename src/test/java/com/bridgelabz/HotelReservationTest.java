package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
    HotelReservationMain HotelReservationSystem = new HotelReservationMain();

    @Test
    public void whenAddedHotel_ShouldReturn_AddedHotel() {
        try{
            boolean isValid1 = HotelReservationSystem.addHotel( new Hotels("LakeWood",110));
            Assert.assertTrue(isValid1);
            boolean isValid2 = HotelReservationSystem.addHotel( new Hotels("Bridgewood",160));
            Assert.assertTrue(isValid2);
            boolean isValid3 = HotelReservationSystem.addHotel( new Hotels("Ridgewood",220));
            Assert.assertTrue(isValid3);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
