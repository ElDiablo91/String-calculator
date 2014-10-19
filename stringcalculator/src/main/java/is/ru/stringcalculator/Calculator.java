package is.ru.stringcalculator;

public class Calculator 
{
	public static int add(String numbers)
	{
		if(numbers.equals(""))
		{
			return 0;
		}
	        else if(!numbers.contains(",") 
			&& !numbers.contains("\n"))
	        {
        	   return toInt(numbers);
       	 	}
        	else if(numbers.contains(","))
        	{
        	   return sum(splitNumbers(numbers));
        	}
        	else if(numbers.contains("\n"))
		{
		   return sum(numbers.split("\n"));
		}
		else
        	{
                   return 10;
		}
	}

	private static int toInt(String number)
	{
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers)
	{
	    	return numbers.split(",");
	}
      
   	private static int sum(String[] numbers)	
	{
 	    	int total = 0;
        	for(String number : numbers)	
		{
		    	total += toInt(number);
		}
		return total;
    	}	
}
