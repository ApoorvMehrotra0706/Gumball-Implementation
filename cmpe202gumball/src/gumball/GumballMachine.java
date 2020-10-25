package gumball;

public class GumballMachine {

    private int num_gumballs;
    private boolean has_required_money;
    private MachineStrategy strategy;

    public GumballMachine(int size, MachineStrategy strategy) {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_required_money = false;
        this.strategy = strategy;
    }

    public void checkinMoney(int coin) {
        this.has_required_money = strategy.money(coin);
    }

    public void turnCrank() {
        if (this.has_required_money) {
            if (this.num_gumballs > 0) {
                this.num_gumballs--;
                this.has_required_money = false;
                strategy.removeEntry();
                System.out.println("Thanks for your quarter.  Gumball Ejected!");
            } else {
                System.out.println("No More Gumballs!  Sorry, can't return your quarter.");
                strategy.removeEntry();
            }
        } else {
            System.out.println("Please insert the coin");
        }
    }

}
