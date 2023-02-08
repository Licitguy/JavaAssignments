package Chapter8;

import java.util.Arrays;
import java.util.Scanner;

import static Chapter8.Bontel.input;

public class Hotel {
    private String[] rooms;

    private String guest;

    Scanner scanner = new Scanner(System.in);

    public String displayHotelMenu() {
        return """
                Welcome!!!
                Enter 1 -> for HotelRoom
                2 -> for BookRoom
                3 -> for GetBookRooms
                4 -> for getRoomGuests
                5 -> for getAllRoomGuests
                6 -> for getAvailableRooms
                7 -> for getRooms
                8 -> for checkOut
                """;
    }

    public Hotel(int roomLength) {
        this.rooms = new String[roomLength];

    }

    public String bookRoom(String user) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = user;
                break;
            }
        }
        return "Room successfully booked!!!";
    }

    public boolean checkOut(int roomNumber) {
        boolean hasCheckedOut = false;
        if (rooms[roomNumber - 1] != null) {
            rooms[roomNumber - 1] = null;
            hasCheckedOut = true;
        }
        return hasCheckedOut;
    }

    public int getRooms() {
        return rooms.length;
    }

    public int getAvailableRoom() {
        int noRooms = rooms.length;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                noRooms--;
            }
        }
        return noRooms;

    }

    public int getBookedRoom() {
        int bookedRooms = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                bookedRooms++;
            }
        }
        return bookedRooms;

    }

    public String getRoomGuest() {
        return guest;
    }

    public String getAllRoomGuest() {
        String allUser = null;
        for (String userInRoom : rooms) {
            if (userInRoom != null) {
                allUser = Arrays.toString(rooms);
            } else {
                break;
            }
        }
        return allUser;
    }


        public void userSelection(){
            int userInput = input.nextInt();
            switch (userInput){
                case 1:
                    System.out.println("Welcome to our Hotel: ");
                    break;
                case 2:
                    System.out.println("Enter guest name: ");
                    String guest = input.next();
                    System.out.println(bookRoom(guest));
                    break;
                case 3:
                    System.out.println(getBookedRoom());
                    break;
                case 4:
                    System.out.println(getAvailableRoom());
                    break;
                case 5:
                    System.out.println(getRoomGuest());
                    break;
                case 6:
                    System.out.println(getAllRoomGuest());
                    break;
                case 7:
                    System.out.println(getRooms());
                    break;
                case 8:
                    System.out.println("Enter room number: ");
                    int roomNumber = input.nextInt();
                    System.out.println(checkOut(roomNumber));
                default:
                    System.out.println("Invalid input!!! please enter a digit within the range of 1 to 8");


            }
        }
    }


