package gumball;

public class GumballMachine2 extends MachineStrategy {

    @Override
    public boolean money(int coin) {
        if (coin == 25)
            totalMoney += coin;
        else
            System.out.println("Coin entry not accepted");

        if (totalMoney >= 50)
            return true;
        return false;
    }

}
