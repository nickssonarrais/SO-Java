

public class Main 
{
	public static void main(String[] args) 
	{
		Thread runner1 = new Thread(new Runner("01", 10, 1));
		Thread runner2 = new Thread(new Runner("02", 10, 1));
		Thread runner3 = new Thread(new Runner("03", 10, 1));
		Thread runner4 = new Thread(new Runner("04", 10, 1));

		runner1.start(); runner2.start(); runner3.start(); runner4.start();

	}

}