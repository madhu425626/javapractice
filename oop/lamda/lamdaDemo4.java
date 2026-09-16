import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        int userAge = Integer.parseInt(IO.readln());

        VoterEligibility voter = age -> 
        {
            if(age>=18)
            {
                return true;
            }
            else
            {
                return false;
            }
        };

      if(voter.check(userAge))
      {
        IO.println("Eligible to Vote");
      }
      else{

        IO.println("Not Eligible to Vote");
      }
    }
}

interface VoterEligibility
{
    boolean check(int age);
}
