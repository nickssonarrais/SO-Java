

public class Runner implements Runnable
{
	private String name;
	private int tam_trajeto;
	private int descanso;

	public Runner(String n, int t, int d)
	{
		name = n;
		tam_trajeto = t;
		descanso = d;
	}

	public void run()
	{
		for (int i = tam_trajeto; i >= 0; i--)
		{
			System.out.println("Faltam " + i + "metros para o corredor " + name);
			System.out.println("Corredor " + name + " está descansando");
			try 
			{
				Thread.sleep(descanso * 1000);
			} catch (Exception e)
			{
				e.printStackTrace();
			}
			
		}

		System.out.println("Correrdor " + name + " terminou!");

	}

}