
public class GumballMachine {

		State soldOutState;
		State noQuarterState;
		State hasQuarterState;
		State soldState;

		State state = soldOutState;
		int count = 0;
		
		public GumballMachine (int numberGumballs){
			soldOutState = new SoldOutState (this);
			noQuarterState = new NoQuarterState (this);
			hasQuarterState = new HasQuarterState (this);
			soldState = new SoldState (this);
			this.count = numberGumballs;
			if (numberGumballs > 0) {
				state = noQuarterState;
			}
			}
				public void insertQuarter(){
					state.insertQuarter();
				}
				public void ejectQuarter(){
					state.ejectQuarter();
				}
				public void turnCrank(){
					state.turnCrank();
					state.dispense();
				}
				void setState(State state){
					this.state = state;
				}
				void releaseBall(){
					System.out.println("A gumball comes rolling out the slot...");
					if (count != 5){
						count = count - 1;
					}
				
				
				//More methods here including getters for each State...
			}

		

		public State getNoQuarterState() {
			// TODO Auto-generated method stub
			return noQuarterState;
		}
		public int getCount() {
			// TODO Auto-generated method stub
			return count;
		}
		public State getHasQuarterState() {
			// TODO Auto-generated method stub
			return hasQuarterState;
		}
		public State getSoldOutState() {
			// TODO Auto-generated method stub
			return soldOutState;
		}
		public String toString(){
			 String status = "Gumball Machine";
			 if(state == hasQuarterState){
				 status = status + "\n status : HAS QUARTER";
			 }else if(state == noQuarterState){
				 status = status + "\n status : NO QUARTER";
			 }else if(state == soldState){
				 status = status + "\n status : SOLD";
			 }else if(state == soldOutState){
				 status = status + "\n status : SOLD OUT"; 
			 }
			 status = status + "\n count : "+this.count; 
			 return status;
		 }	
	

}
