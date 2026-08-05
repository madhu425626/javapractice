import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        String name = IO.readln();
        int wickets = Integer.parseInt(IO.readln());
        int matches = Integer.parseInt(IO.readln());
        int balls_bowled = Integer.parseInt(IO.readln());
        int runs_conceded = Integer.parseInt(IO.readln());

        Bowler ball = new Bowler(name,wickets,matches,balls_bowled,runs_conceded);
        IO.println("Name: "+ball.name);
        ball.computeBowlingAverage();
        IO.println("Name: "+ball.name);
        ball.computeStrikeRate();
        IO.println("Name="+ball.name);
        IO.println("wickets="+ball.wickets);
        IO.println("matches="+ball.matches);
        IO.println("balls_bowled="+ball.balls_bowled);
        IO.println("runs_conceded="+ball.runs_conceded);




        
        
    }
}

class Bowler{
    String name;
    int wickets;
    int matches;
    int balls_bowled;
    int runs_conceded;

    public Bowler(String name,int wickets,int matches,int balls_bowled,int runs_conceded){

        if(runs_conceded < 0 | balls_bowled < 0 | matches < 0 |  wickets < 10){
            System.out.println("Error");
            System.exit(0);
        }
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;

    }

    public void computeBowlingAverage()
    {
        double result = (double)this.runs_conceded/this.wickets;
        System.out.printf("bowling_avg=%.1f\n",result);
    }

    public void computeStrikeRate()
    {
        double result = (double)this.runs_conceded/this.balls_bowled;
        System.out.printf("Strike_rate=%.3f\n",result);
    }
}
