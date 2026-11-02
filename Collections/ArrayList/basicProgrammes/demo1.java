arraylist

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        List <String> list =new ArrayList<> ();

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<=size; i++)
        {
            String values = sc.nextLine();
            list.add(values);

        }

        sc.close();
        System.out.println("Updated cart: "+list);
    }
}



import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        List<String> listOfFvorites = new ArrayList<>(List.of("Movie1","Movie2","Movie3"));

        String removeElement = IO.readln().trim();
boolean isfound=false;
for(int i=0;i<listOfFvorites.size();i++){
    if(listOfFvorites.get(i).equals(removeElement)){
        listOfFvorites.remove(removeElement);
        isfound=true;
    }
}
if(!isfound){
    IO.println("Item not found");
}
else
IO.println("Updated favorites: "+listOfFvorites);

        // if(listOfFvorites.contains(removeElement)){
        //     listOfFvorites.remove(removeElement);
        //     IO.println("Updated favorites: "+listOfFvorites);
        // }
        // else{
        //     IO.println("Item not found");
        // }

        

    }
}



import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        List <String> listOfStudents = Arrays.asList("Swati", "Sam", "Sonali");
        String removeElement = IO.readln().trim();
        IO.println(listOfStudents.contains(removeElement));
    }
}


import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        List<String> listOfProducts = new ArrayList<>();
        List<String> listOfProductsExpired = new ArrayList<>();
        int size = Integer.parseInt(IO.readln());
        if(size<1)
        {
            IO.println("Invalid offers size.");
            System.exit(0);
        }
        for(int i = 0; i<size; i++)
        {
            String product = IO.readln();
            listOfProducts.add(product);
        }

        int noOfProductsExpired = Integer.parseInt(IO.readln());
        
        for(int i = 0; i<noOfProductsExpired; i++)
        {

            String product = IO.readln();
             listOfProductsExpired.add(product);
        }

        listOfProducts.removeAll(listOfProductsExpired);

        IO.println("Valid offers: "+listOfProducts);
    }
}



import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        List <Integer> listOfStudents = new ArrayList<>();
        int size = Integer.parseInt(IO.readln());
        for(int i = 0; i<size; i++)
        {
            int marks = Integer.parseInt(IO.readln());
            listOfStudents.add(marks);
        }


        for(int i = 0; i<listOfStudents.size(); i++)
        {
            if(listOfStudents.get(i) <= 40)
            {
                listOfStudents.remove(i);
            }
        }
        //listOfStudents.removeIf(num->  num <=40);
        IO.println("Filtered: "+listOfStudents);
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

