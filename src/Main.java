import model.client.Groomer;
import model.client.Pet;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------Create the pet grooming salon--------------");
        Groomer petGroomers = new Groomer();

        //book someone into the salon
        System.out.println("---------Make and confirm booking-----------");
        Pet fido = new Pet("Fido");
        petGroomers.makeNewBooking(fido, 10);
        petGroomers.verifyBooking(fido, 10);
        fido.confirmBooking();

        //change the booking for elisa
        System.out.println("---------Change a booking-------------------");
        petGroomers.changeBooking(fido, 13);
        fido.confirmBooking();
        petGroomers.verifyBooking(fido, 11);

        //can we find people's bookings by name?
        System.out.println("---------Check booking by name---------------");
        System.out.println("Can we find Fido by name? "+petGroomers.confirmBookedName("Fido", 13));

        //print out all the bookings
        System.out.println("---------------------------------------------");
        System.out.println("All the bookings for the day:");
        System.out.println("---------------------------------------------");
        petGroomers.printBookingsList();
        System.out.println("---------------------------------------------");
    }
}
