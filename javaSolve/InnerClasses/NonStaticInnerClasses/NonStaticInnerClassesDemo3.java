
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

public class NonStaticInnerClassesDemo3{
  public static void main(String []args){
    Person in = new Person(23,"Madhu");
    in.display();
  }
}

