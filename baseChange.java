package math.functions;

public class baseChange
{
	public static String values = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static void main(String args[])
	{
		int base = Integer.parseInt(args[0]);
		int originalValue = Integer.parseInt(args[1]);
		System.out.println(newBase(base, originalValue));
	}

	public static String newBase(int base, int val)
	{
		int value = val;
		String rtn = "";
		while(value!=0)
		{
			rtn = values.substring(value%base, value%base + 1) + rtn;
			value/=base;
		}
		return rtn;
	}
}