//Driver Class

public class WTCCarlinBoykinHarmon {

    public static void main(String[] args){

        //land options
        Bus greyhound = new Bus(25,70,8.50,"Ticket", 6, "Yes");
        Train  rockyMountaineer = new Train(100,80,12.75,"Ticket", 30, "Yes");
        Bike schwinn = new Bike(2,30,8.50,"Rental", 2, "Yes");
        Automobile toyota = new Automobile(4,100,32,"Rental", 4, "No");

        //water options
        Submarine Titan = new Submarine(5, 50, 100000, "Ticket", "nuclear", 50000);
        Boat GenericBoat = new Boat(4, 15, 250, "rental", "sail", "individual");
        Ship CruiseShip = new Ship(1000, 500, 1000, "ticket", "steam", true);
    }
}
