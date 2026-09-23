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


/*

//Prime Number Revision
public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      int input  = Integer.parseInt(IO.readln());
      PrimeNumberChecker primeNumber = new PrimeNumberChecker();
       boolean isPrimeOrNot =  primeNumber.isPrime(input);
     IO.println("the given number is :"+input+" is Prime Number ? "+isPrimeOrNot);
    }
}

class PrimeNumberChecker
{
  public boolean isPrime(int input)
  {
      if(input <=1)
      {
        //IO.println("is not priime");
        return false;
      }
      else{
        int count  = 0;

        for(int i = 2; i<=input; i++){

          if(input%i == 0)
          {
            count += 1;
          }

          
          
        }
          if(count == 1)
          {
            //IO.println("is  priime");
            return true;
          }
          else{
            return false;
           // IO.println("not a priime");
          }
           
      }

  }
}

*/
