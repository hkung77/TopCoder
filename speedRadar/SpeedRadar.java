public class SpeedRadar {
	public double averageSpeed(int minLimit, int maxLimit, int[] readings)
	{
	 	int sum = 0;
	 	double mean = 0;
	 	int count = 0;
	 	
		// calculate the sum of all cars
		for (int i = 0; i<readings.length; i++)
		{
			if ( maxLimit >= readings[i] && readings[i] >= minLimit)
			{   
				sum = sum + readings[i];
			} else {
				count++;
			}
		}
		
		if (count >= readings.length *0.1 ){
			return 0.0;
		}
		mean = sum / readings.length; 
		return mean;
	}
}