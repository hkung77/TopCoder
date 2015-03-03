import java.util.Arrays;

public class SymbolFrequency  
{
	public double language(String[] frequencies, String[] text)
	{
		double smallest_deviation = 0;
		// for each string in text
		for ( int i = 0; i < text.length; i++) 
		{
		
			int[] character_count = new int[26];
			double[] actual_frequencies = new double[26];
			double[] frequency_deviation = new double[frequencies.length];

			// removes white space from character
			text[i] = text[i].replaceAll(" ","");

			// sort the characters
			char[] sorted_characters = text[i].toCharArray();
			Arrays.sort(sorted_characters);

			// count the characters
			for (int j = 0; j < sorted_characters.length; j++)
			{
				int index = (int)sorted_characters[j] - 97;
				character_count[index]++;
			}
			
			// calculate percentage 
			for (int j = 0; j < character_count.length; j++)
			{
				 actual_frequencies[j] = (double)character_count[j]/(double)sorted_characters.length*100;
				 System.out.println(actual_frequencies[j]);
			}

			// parse through the frequencies
			for (int j = 0; j < frequencies.length; j++)
			{
				String temp = frequencies[j];
				double freq_array[] = new double[26];
				for (int n = 0; n < temp.length(); n++)
				{			
					int index = (int)(temp.charAt(n)) - 97;
					freq_array[index] = Integer.parseInt(temp.substring(n+1,n+3));
					n = n+2;
				}
				// compare actual frequency to the ideal frequency
				//System.out.println("sum");
				double sum = 0;
				for (int n = 0; n < freq_array.length; n++)
				{
					sum = sum + Math.pow((freq_array[n] - actual_frequencies[n])/10,2);
					System.out.println(sum);
				}
				frequency_deviation[j] = sum;
				
			}
			// find minimal value in frequency_deviation 
			for (int j = 0; j < frequency_deviation.length; j++ )
			{
				if (j == 0 && i == 0)
				{
					smallest_deviation = frequency_deviation[j];
				}
				else if ( smallest_deviation > frequency_deviation[j])
				{
					smallest_deviation = frequency_deviation[j];
				}
			}
		}
		return smallest_deviation;
	}
}