package gumball;

// public interface MachineStrategy {
//     public void money(int coin);

//     public void removeEntry();

//     public boolean getAvailableMoney();
// }

abstract class MachineStrategy {
    protected int totalMoney;

    public abstract boolean money(int coin);

    public void removeEntry() {
        totalMoney = 0;
    }
}