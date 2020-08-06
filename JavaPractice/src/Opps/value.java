package Opps;

public class value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DecreasingCounter counter = new DecreasingCounter(10);

counter.printValue();

counter.decrement();
counter.printValue();

counter.decrement();
counter.printValue();

counter.reset();
counter.printValue();

counter.decrement();
counter.printValue();
	}

}
