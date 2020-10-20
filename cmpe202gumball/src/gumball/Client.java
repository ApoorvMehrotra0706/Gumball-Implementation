package gumball;

public class Client {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(4, new GumballMachine1());
        System.out.println("\n \n \n \n");
        System.out.println("*********************** For Machine 1 *********************");
        System.out.println("** Entering 25 cents and turning crank **");
        gumballMachine.checkinMoney(25);
        gumballMachine.turnCrank();
        System.out.println("** Turning crank without entering any cents **");
        gumballMachine.turnCrank();
        System.out.println(
                "** Entering cents other than 25 and turning crank (a nickel then a dime) , error message received**");
        gumballMachine.checkinMoney(5);
        gumballMachine.checkinMoney(10);
        gumballMachine.turnCrank();
        System.out.println(
                "** Entering two 25 cents coins and turning crank twice, both turns should eject a gumballs **");
        gumballMachine.checkinMoney(25);
        gumballMachine.checkinMoney(25);
        gumballMachine.turnCrank();
        gumballMachine.turnCrank();
        System.out.println("************************ For Machine 2 *********************");
        // gumballMachine.changeMachine(new GumballMachine2());
        gumballMachine = new GumballMachine(5, new GumballMachine2());
        System.out.println(
                "** Entering 2 coins of 25 cents one after the other and turning crank, gumball will eject **");
        gumballMachine.checkinMoney(25);
        gumballMachine.checkinMoney(25);
        gumballMachine.turnCrank();
        System.out.println("** Entering a 25 cents coin and turning crank, gumball won't eject **");
        gumballMachine.checkinMoney(25);
        gumballMachine.turnCrank();
        System.out.println("** Entering a 25 cents coin and turning crank, now total 50 so a gumball will eject **");
        gumballMachine.checkinMoney(25);
        gumballMachine.turnCrank();
        System.out.println("** Entering a 5 cents coin ( 1 nickel), receiving error message **");
        gumballMachine.checkinMoney(5);
        System.out.println("** Entering a 10 cents coin (1 dime), receiving error message **");
        gumballMachine.checkinMoney(10);
        System.out.println("** Entering three 25 cents coin and turning crank, one gumball ejected **");
        gumballMachine.checkinMoney(25); // 1
        gumballMachine.checkinMoney(25); // 2
        gumballMachine.checkinMoney(25); // 3
        gumballMachine.turnCrank();
        System.out.println("** Turning crank again, gumball won't eject as only one 25 cents coin present **");
        gumballMachine.turnCrank();
        System.out.println(
                "** Inserting one more 25 cents coin and turn crank, now total two 25 cents coins, gumball ejected **");
        gumballMachine.checkinMoney(25);
        gumballMachine.turnCrank();
        System.out.println("************************ For Machine 3 *********************");
        // gumballMachine.changeMachine(new GumballMachine3());
        gumballMachine = new GumballMachine(3, new GumballMachine3());
        System.out.println(
                "** Entering 50 cents in the form on 5 cents (1 nickel), 10 cents (1 dime) and 25 cents (1 quarter), gumball ejected **");
        gumballMachine.checkinMoney(25); // Total 25
        gumballMachine.checkinMoney(5); // Total 30
        gumballMachine.checkinMoney(5); // Total 35
        gumballMachine.checkinMoney(10); // Total 45
        gumballMachine.checkinMoney(5); // Total 50
        gumballMachine.turnCrank();
        System.out.println("** Turning crank again, gumball won't eject **");
        gumballMachine.turnCrank();
        System.out.println(
                " **Entering 75 cents in total, ejecting one gumball and storing 25 cents for the next transcation **");
        gumballMachine.checkinMoney(25); // Total 25
        gumballMachine.checkinMoney(5); // Total 30
        gumballMachine.checkinMoney(5); // Total 35
        gumballMachine.checkinMoney(10); // Total 45
        gumballMachine.checkinMoney(5); // Total 50
        gumballMachine.checkinMoney(25); // Total 75
        gumballMachine.turnCrank();
        System.out.println("** Turning crank again, gumball won't eject **");
        gumballMachine.turnCrank();
        System.out.println("** Entering 25 cents, turning crank , total now becomes 50, gumball ejected **");
        gumballMachine.checkinMoney(25); // Total 50 now ( 25 left above + 25 entere now)
        gumballMachine.turnCrank();
        System.out.println(
                " ** Gumballs are over now, inserting 50 cents and turning crank, no gumball message expected **");
        gumballMachine.checkinMoney(25); // Total 25
        gumballMachine.checkinMoney(5); // Total 30
        gumballMachine.checkinMoney(5); // Total 35
        gumballMachine.checkinMoney(10); // Total 45
        gumballMachine.checkinMoney(5); // Total 50
        gumballMachine.turnCrank();

    }

}
