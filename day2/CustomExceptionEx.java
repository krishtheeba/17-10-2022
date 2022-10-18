package day2;

public class CustomExceptionEx {

	void loadPlayer() throws TimeOutException {
		throw new TimeOutException("This takes more time");
	}
	
	
	public static void main(String[] args) {

	}

}
