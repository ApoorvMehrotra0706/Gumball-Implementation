package gumball;

public class GumballMachine1 implements MachineStrategy {
    private int totalMoney;

    @Override
    public void money(int coin) {
        if (coin == 25)
            totalMoney += 25;
        else
            System.out.println("Coin entry not accepted");
    }

    @Override
    public void removeEntry() {
        totalMoney -= 25;
    }

    @Override
    public boolean getAvailableMoney() {
        return this.totalMoney >= 25 ? true : false;

    }

}
