package Chapter8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {
    Hotel hotel;
    @BeforeEach
    void startAllTestWith() {
        hotel = new Hotel(10);
        assertNotNull(hotel);
    }
    @Test
    void testThatRoomCanBeBooked(){
        assertEquals("Room successfully booked!!!",hotel.bookRoom("Bolaji"));

    }
    @Test
    void testUserCanCheckOut(){
        hotel.bookRoom("Bolaji");
        assertTrue(hotel.checkOut(1));
    }
    @Test
    void getAllRoomsTest(){
          assertEquals(10,hotel.getRooms());

    }
    @Test
    void getAvailableRoomsTest(){
        hotel.bookRoom("Biodun");
        hotel.bookRoom("Bolaji");
        hotel.bookRoom("Jibola");
        assertEquals(7, hotel.getAvailableRoom());

    }
    @Test
    void getBookedRoomsTest(){
        hotel.bookRoom("Bolaji");
        assertEquals(1, hotel.getBookedRoom());

    }
    @Test
    void getRoomGuestTest(){
        hotel.bookRoom("Koko");
        assertEquals("Koko", hotel.getRoomGuest());
    }
    @Test
    void getAllRoomGuestsTest(){
        hotel.bookRoom("Koko");
        hotel.bookRoom("jojo");
        hotel.bookRoom("kiki");
        hotel.bookRoom("Dodo");
        assertEquals("[Koko, Jojo, Kiki, Dodo, null, null, null, null, null, null]", hotel.getAllRoomGuest());
    }
}



