package gumball;

public class GumballMachine3 implements MachineStrategy {
    private int totalMoney;

    @Override
    public void money(int coin) {
        if (coin == 5)
            totalMoney += coin;
        else if (coin == 10)
            totalMoney += coin;
        else if (coin == 25)
            totalMoney += coin;
        else
            System.out.println("Coin entry not accepted");
    }

    @Override
    public void removeEntry() {
        totalMoney -= 50;
    }

    @Override
    public boolean getAvailableMoney() {
        return this.totalMoney >= 50 ? true : false;
    }
}