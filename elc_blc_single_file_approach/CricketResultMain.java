import java.util.*;

public class CricketResultMain {
    public static void main(String[] args) {
        // Write your code here
    String name = IO.readln();
    int wickets = Integer.parseInt(IO.readln());
    int matches = Integer.parseInt(IO.readln());
    int balls_bowled = Integer.parseInt(IO.readln());
    int runs_conceded = Integer.parseInt(IO.readln());

    Bowler b  = new Bowler();
    b.bowlerDetails(name,wickets,matches,balls_bowled,runs_conceded);

    IO.println("Name: "+b.name);
    b.computeBowlingAvg();
    IO.println("Name: "+b.name);
    b.computeStrike();
    IO.println("Name="+b.name);
    IO.println("wickets="+b.wickets);
    IO.println("matches="+b.matches);
    IO.println("balls_bowled="+b.balls_bowled);
    IO.println("runs_conceded="+b.runs_conceded);
    }
}

class Bowler{
    String name;
    int wickets;
    int matches;
    int balls_bowled;
    int runs_conceded;

    public void bowlerDetails(String name, int wickets, int matches, int balls_bowled, int runs_conceded){
        this.name=name;
        this.wickets = wickets;
         if(wickets<=0){
            IO.println("Error");
            System.exit(0);
        }
         if(matches<=0){
            IO.println("Error");
            System.exit(0);
        }
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

    public void computeBowlingAvg(){
       
        System.out.printf("bowling_avg=%.1f%n",((double) this.runs_conceded/this.wickets));
    }

    public void computeStrike(){
       
         System.out.printf("Strike_rate=%.3f%n",((double) this.runs_conceded/this.balls_bowled));

    }
}
