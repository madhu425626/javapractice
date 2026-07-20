// Write a Java program that accepts a number from the command line and checks whether it is a prime number or not.
void main(String []args){
	int prime = Integer.parseInt(args[0]);
	IO.println(isPrime(prime));
	
}

boolean isPrime(int num){
	
	
	if(num <= 1)
		return false;
	
	for (int i = 2;i<num ;i++ )
	{
		if(num%i == 0)
			return false;
	}
	return true;
	
}
