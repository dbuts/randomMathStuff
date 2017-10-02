package math.functions;

public class powers
{
	public static void main(String[] args)
	{
		double base = Double.parseDouble(args[0]);
		int power = Integer.parseInt(args[1]);
		System.out.println(getPower(base, power));
	}

	public static double getPower(double bas, int pow)
	{
		if(pow == 0)
		{
			return 1;
		}
		else
		{
			return bas*(getPower(bas, pow-1));
		}
	}
}