
public class WinnerState implements State {
	GumballMachine gumballMachine;

	
	public WinnerState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Please wait, we're already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Sorry, you already turned the crank");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("YOU'RE A WINNER! You get two gumballs for you quarter");
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() == 0){
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}else {
			gumballMachine.releaseBall();
			if(gumballMachine.getCount()> 0){
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			}else{
				System.out.println("Oops, out of gumballs!");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

	}


