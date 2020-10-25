package gumball;

public class GumballMachine1 extends MachineStrategy {

    @Override
    public boolean money(int coin) {
        if (coin == 25)
            totalMoney += 25;
        else
            System.out.println("Coin entry not accepted");
        if (totalMoney >= 25)
            return true;
        return false;
    }
}
