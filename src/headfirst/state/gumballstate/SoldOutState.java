package headfirst.state.gumballstate;

public class SoldOutState implements State{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("the madhine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you haven`t inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed");
    }
}
