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
        strategy.money(coin);
    }

    public void turnCrank() {
        this.has_required_money = strategy.getAvailableMoney();
        if (this.has_required_money) {
            if (this.num_gumballs > 0) {
                this.num_gumballs--;
                this.has_required_money = false;
                System.out.println("Thanks for your money.  Gumball Ejected!");
                this.strategy.removeEntry();
            } else {
                System.out.println("No More Gumballs!  Sorry, can't return your money.");
            }
        } else {
            System.out.println("Please insert a coin");
        }
    }

}
