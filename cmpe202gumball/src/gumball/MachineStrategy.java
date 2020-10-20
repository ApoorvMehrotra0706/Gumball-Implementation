package gumball;

public interface MachineStrategy {
    public void money(int coin);

    public void removeEntry();

    public boolean getAvailableMoney();
}