
// public class Main {
//     public static void main(String[] args) {
//       System.out.println("Hello, World!");
//       Outer.Inner in = new Outer(). new Inner();
//       in.show();
//     }
// }

// class Outer{
//   private int x;
//   class Inner{
//     int x = 99;
//     void show(){
//       IO.println("x value : "+x);
//       IO.println(Outer.this.x);
//     }
//   }
// }

// 

// class Outer{
//   int x = 9;
//   class Inner{
//     int x = 99; //Variable Shadowing
//     void display(){
//       IO.println("val of x : "+x);
//       IO.println("val of x in outer class is : "+Outer.this.x);
//     }
//   }
// }

// public  class Main{
//     public static void main(String[] args){
//       Outer.Inner in = new Outer(). new Inner();
//       in.display();
//     }
// }

/*
class Person{
  int age;
  String name;
  Heart heart; //Heart class obj reference [in directly Heart heart = new Heart(72)]

  Person(int age, String name){
    this.age = age;
   this.name = name;
    this.heart = new Heart(72); //holding obj not value
  }

  void display(){
    IO.println("Age : "+this.age);
    IO.println("Name : "+this.name);
    IO.println("Heart BEATS : "+ heart.heartBeats); //access with referenc variable not with the class name
  }

  class Heart{
    int heartBeats;//
    String name;
    Heart(int x){
      this.heartBeats = x;
    //this.name = name;

    }
  }
}

public class Main{
  public static void main(String []args){
    Person in = new Person(23,"Madhu");
    in.display();
  }
}
*/


class Univericity{

  private String univericityName;
  

  public Univericity(String univericityName){        

    this.univericityName = univericityName; 
    
  }

  public void univericityDetails(){
    IO.println("Univericity name is : "+this.univericityName);
    
  }

  class Department{
    private String departmentName;
    private int departmentNum;

    Department(String name, int num){
      this.departmentName = name;
      this.departmentNum = num;
    }

    public void departmentDetails(){

      univericityDetails();
      IO.println("Department Name : "+departmentName);
      IO.println("Department Number : "+departmentNum);

    }

  }

}

public class Main{

public static void main(String[] args){  

  Univericity u = new Univericity("JNTU");
  //u.univericityDetails();
  Univericity.Department d = u.new Department("ECE",909);
  Univericity.Department e = u.new Department("CSE",606);
  d.departmentDetails();
    IO.println("------------------------------------------------");

  e.departmentDetails();

}
}



























