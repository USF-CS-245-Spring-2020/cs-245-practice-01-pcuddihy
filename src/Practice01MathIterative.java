public class Practice01MathIterative implements Practice01Math
{
	public int fib (int n)
	{
		int num1, num2, num3; //set first two fibs and num3 for incrementing
		num1 = 0;
		num2 = 1;
		if (n == 0)
		{
			return num1;
		}

		for (int i = 2; i <= n; i++) //for that sets the current number to past two numbers and 
		//changes the past two numbers for further incrementations
		{
			num3 = num1 + num2;             
			num1 = num2;
			num2 = num3;
		}
		return num2; //returns what will either be last number or 1
	}
	
	public int fact(int n)
	{
		if (n < 1) //if n is less than 0, return 0
		{
			return 0;
		}
		else //while loop with i incrementing up to n that times each new i against a running product
		{
			int product, i;
			product = 1;
			i = 1;
			while (i <= n)
			{
				product *= i;
				i++;
			}
			return product; //return the factorial
		}
	}
}