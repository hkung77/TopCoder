public class FountainOfLife
{
	public double elixirOfDeath(int elixir, int poison, int pool)
	{
		int t = 0;
		double percent = 0;
		int elixir_amount = 0;
		int poison_amount = 0;
		if (elixir > poison )
		{
			return -1.0;
		} else {
			while (percent < 50) {
				if ( t == 0 ) {
					elixir_amount = pool;
					percent = 0;
				} else {
					elixir_amount += elixir;
					poison_amount += poison;
					percent = ((double)(poison_amount)/(double)(elixir_amount+poison_amount))*100;
					System.out.println(percent);
				}
				t++;
			}
			return (double)(t -1); 	
		}
	}
}