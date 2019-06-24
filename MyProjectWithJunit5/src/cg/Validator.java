package cg;

public class Validator {
	public boolean validateNo(String data)
	{
		return data.matches("\\d+");
	}
	public boolean isPalindrone(String data)
	{
		StringBuffer sb= new StringBuffer(data);
		String reverseS = sb.reverse().toString();
		
		return data.equals(reverseS);
	}
	
	public int getSizeinMl(Size size)
	{
		System.out.println(size +" "+size.getMl());
		return size.getMl();
	
	}
}
