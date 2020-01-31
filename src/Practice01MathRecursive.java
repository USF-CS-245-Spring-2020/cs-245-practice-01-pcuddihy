public class Practice01MathRecursive implements Practice01Math
{
	public int fib (int n)
	{
		if (n == 0) //if n is 0, return 0, base cases
		{
			return 0;
		}
		if (n == 1) //if n is 1, return 1, base cases
		{
			return 1;
		}
		return (fib(n - 1) + fib(n - 2)); //add up number one before and the number two before and return
	}
	
	public int fact(int n) //this factorial i got from geeksforgeeks 
	//and it helped me in understanding how to do the recursive fibonacci
	{
		if (n <= 0) //make factorial 1 if input is negative or 0, base case
		{
			return 1;
		}
		else
		{
			return (n * fact(n - 1)); //return the product of n times the factorial of n - 1
		}
	}
}