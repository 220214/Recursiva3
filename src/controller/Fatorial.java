package controller;

public class Fatorial {

	public Fatorial() {
		super();
	}
	public int Fat(int num) {
		if (num ==0 || num ==1) {
			return 1;
		}else {
			return num*Fat(num-1);
		}
	}

}
