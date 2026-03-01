/**
 * DinnerEvent represents a hosted dinner gathering.
 * Each object stores details about the event and
 * provides a method to calculate the total estimated cost.
 */
public class DinnerEvent {

    private String hostName;
    private int numberOfGuests;
    private double costPerGuest;

    /**
     * Constructor for DinnerEvent
     * Initializes the event with a host name, number of guests, and cost per guest.
     */
    public DinnerEvent (String hostName, int numberOfGuests, double costPerGuest) {
        this.hostName = hostName;
        this.numberOfGuests = numberOfGuests;
        this.costPerGuest = costPerGuest;
    }

    /**
     * Method to calculate total estimated cost
     * of hosting the dinner.
     */
    public double calculateTotalCost() {
        return numberOfGuests * costPerGuest;
    }

    /**
     * Method to display event details.
     */
    public void displayEventDetails() {
        System.out.println("Host: " + hostName);
        System.out.println("Guests: " + numberOfGuests);
        System.out.println("Cost per guest: $" + costPerGuest);
        System.out.println("Total estimated cost: $" + calculateTotalCost());
    }

    // Main method to instantiate objects
    public static void main(String[] args) {

        // Creating objects using the constructor
        DinnerEvent birthdayDinner = new DinnerEvent("Clarissa", 8, 35.50);
        DinnerEvent holidayParty = new DinnerEvent("Aaron", 12, 28.75);

        birthdayDinner.displayEventDetails();
        System.out.println();
        holidayParty.displayEventDetails();
    }
}