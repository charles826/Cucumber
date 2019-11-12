package stepDefinitions;


public class Checkout {

	private int runningTotal = 0;
    public int total() {
        
		return runningTotal ;
    }

	public void add(int alreadyInput1, int input1) {
		// TODO Auto-generated method stub
		runningTotal = alreadyInput1+input1;
	}
	
}
