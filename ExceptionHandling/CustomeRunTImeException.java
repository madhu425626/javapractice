//class notes problem custome exception


package com.madhu.customeCheckedException;

public class CustomeRunTImeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = Integer.parseInt(IO.readln());
		ageForVote(age); //handling is optional
	}

	public static void ageForVote(int age) throws CustomeRuntimeExveption
	 {
		if(age <= 18)
		{
			throw new CustomeRuntimeExveption("invalid age");
		}
		else
		{
			IO.println("eligle to vote");
		}
	}
}


class CustomeRuntimeExveption extends RuntimeException
{
	CustomeRuntimeExveption()
	{
		
	}
	
	CustomeRuntimeExveption(String errMeg)
	{
		super(errMeg);
	}			
}
