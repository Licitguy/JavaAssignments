/*
package Chapter8;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NedAirTest {

    private  GoodAir goodAir;
    private int firstClassTicketBooking;
    private int economyClassTicketBookingRequest;
    @BeforeEach
    void setUp() {
        firstClassTicketBooking = 1;
        economyClassTicketBookingRequest = 2;

        //given
        goodAir=new GoodAir();
    }

    @Test
    public void testNedAirHasTenSeats(){
        //when
        boolean[] seats = goodAir.getSeats();
        //assert
        assertEquals(10, seats.length);
    }

    @Test
    public void testThatPlaneSeatsAreUnoccupiedByDefault(){
        //when
        boolean[] seats = goodAir.getSeats();
        //assert
        boolean[] expected = {false, false, false, false, false, false, false, false, false, false};
        assertEquals(10, expected.length);
        assertArrayEquals(expected, seats);

    }

    @Test
    public void testThatCustomersCanBookFirstClassPlaneTicket(){
        //when
        goodAir.bookTicket(firstClassTicketBooking);
        //assert
        int planeFirstSeat=0;
        boolean[] seats = goodAir.getSeats();
        assertTrue(seats[planeFirstSeat]);
    }

    @Test
    public void testThatCustomerCanBookEconomyClassTicket(){
        int planeFirstEconomySeat = 5;
        //when
        goodAir.bookTicket(economyClassTicketBookingRequest);
        //assert
        boolean[] seats = goodAir.getSeats();
        assertTrue(seats[planeFirstEconomySeat]);
    }

    @Test
    public void testThatExceptionIsThrownWhenBookingCategoryIsInvalid(){
        int invalidBookingCategory = 10;
        assertThrows(RuntimeException.class,
                ()->goodAir.bookTicket(invalidBookingCategory));
    }

    @Test
    public void testThatExceptionIsThrownWhenFirstClassSectionIsFilled(){
        goodAir.bookTicket(firstClassTicketBooking);
        goodAir.bookTicket(firstClassTicketBooking);
        goodAir.bookTicket(firstClassTicketBooking);
        goodAir.bookTicket(firstClassTicketBooking);
        goodAir.bookTicket(firstClassTicketBooking);
        assertThrows(RuntimeException.class, ()->goodAir.bookTicket(firstClassTicketBooking),
                goodAir.getSectionFullErrorMessage());
    }

    @Test
    public void testThatExceptionIsThrownWhenEconomyClassSectionIsFilled(){
        goodAir.bookTicket(economyClassTicketBookingRequest);
        goodAir.bookTicket(economyClassTicketBookingRequest);
        goodAir.bookTicket(economyClassTicketBookingRequest);
        goodAir.bookTicket(economyClassTicketBookingRequest);
        goodAir.bookTicket(economyClassTicketBookingRequest);
        assertThrows(RuntimeException.class, ()->goodAir.bookTicket(economyClassTicketBookingRequest),
                goodAir.getEconomyClassSectionFilledErrorMessage());
    }

    @Test
    public void testThatBoardingPassCanBeGenerated(){
        FlightForm flightForm = new FlightForm("Lagos", "Zamfara");
        String boardingPass = goodAir.getBoardingPass(flightForm);
        assertNotNull(boardingPass);
        assertTrue(boardingPass.contains("Flight Category"));
    }

}
*/
