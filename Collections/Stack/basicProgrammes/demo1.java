import java.util.*;

public class Main {
    public static void main(String[] args) {
       
       Stack<String> stack=new Stack<>();
     int tabs=Integer.parseInt(IO.readln().trim());
      
       for(int i=0;i<tabs;i++)
       {
        stack.push(IO.readln().trim());
       }
       IO.println("Stack before pop: "+stack);
       if(stack.size()>0)
      IO.println("Closed Tab: "+stack.pop());
      else
      {
        IO.println("No tabs to close.");

      }
      IO.println("Stack after pop: "+stack);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Stack<String> stack = new Stack<>();
       int size = Integer.parseInt(IO.readln().trim());
       for(int i=0; i<size; i++)
       {
        String tabName = IO.readln().trim();
        stack.push(tabName);
       }  

        if(stack.size()>0)
        {
       IO.println("Current Tab: "+stack.peek());       
        }
        else
        {
            IO.println("No tabs available.");
            //IO.println("Stack after peek: "+stack);
        }
       IO.println("Stack after peek: "+stack);       
    }
}

import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Write your code here
        Stack<String> stack = new Stack<> ();
        int size =  Integer.parseInt(IO.readln());
        for(int i = 0; i<size; i++)
        {
            String tab = IO.readln();
            stack.push(tab);
        }
        

        IO.println("Are any tabs open? "+!stack.isEmpty());
    }
}


import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Stack<String> listOfTabs =new Stack<>();
        int size =  Integer.parseInt(IO.readln().trim());
        for(int i = 0; i<size; i++)
        {
            String tab = IO.readln().trim();
            listOfTabs.push(tab);
        }

        String tabToSearch = (IO.readln().trim());
        int tabPosition = listOfTabs.search(tabToSearch);
        if(tabPosition == -1)
        {
            IO.println("Tab not found.");

        }

        else
        {
        IO.println("Tab '"+tabToSearch+"' is  "+tabPosition+" position(s) from the top.");
            
        }
    }
}
























import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Stack<String> listOfTabs =new Stack<>();
        int size =  Integer.parseInt(IO.readln().trim());
        for(int i = 0; i<size; i++)
        {
            String tab = IO.readln().trim();
            listOfTabs.push(tab);
        }
        IO.println("Total open tabs: "+listOfTabs.size()); 
    }
}
