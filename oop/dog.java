public class MainDog{
    public static void main(String[] args){
        Dog dog  = new Dog();
        dog.takeDetails();
        dog.getDetails();
        IO.println(dog.DogName+" is barking!");
    }
}

class Dog{
    String DogName;
    double DogHeight;
    int DogAge;


    public void takeDetails(){
        String name = IO.readln();
        double height = Double.parseDouble(IO.readln());
        int age = Integer.parseInt(IO.readln());

        DogName = name;
        DogAge = age;
        DogHeight = height;
    }

  

    public void getDetails(){
        IO.println("Dog Name : "+DogName);
        IO.println("Dog Height : "+DogHeight);
        IO.println("Dog Age : "+DogAge);
    }
}
