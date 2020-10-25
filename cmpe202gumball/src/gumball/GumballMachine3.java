package gumball;

public class GumballMachine3 extends MachineStrategy {

    @Override
    public boolean money(int coin) {
        if (coin == 5)
            totalMoney += coin;
        else if (coin == 10)
            totalMoney += coin;
        else if (coin == 25)
            totalMoney += coin;
        else
            System.out.println("Coin entry not accepted");

        if (totalMoney >= 50)
            return true;
        return false;
    }

}
