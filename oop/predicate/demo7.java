import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");

      int size = Integer.parseInt(IO.readln("Enter no Of Students You Want to Enter Marks..."));
      Student s [] = new Student[size];

      for(int i = 0; i<size; i++)
      {

        int id = Integer.parseInt(IO.readln("Enter student Id :"));
        String name = IO.readln("Enter student Name :");
        double marks = Double.parseDouble(IO.readln("Enter student Marks :"));

        s[i] = new Student(id,name,marks);
      }

      Predicate<Student> s1 = emp -> emp.marks() >= 35;
     for(Student std: s )
     {
       if(s1.test(std))
       {
          IO.println("Congratulations "+std.name()+" is Passed with "+std.marks());
       }
       else{
        IO.println("Arrary"+ std.name()+"uuu...! nik saduvu n dhuku raaa  MODDHUUU Suntaaa 😂🤣 ");
       }

     }
      

    }
}



record Student(int id, String name, double marks)
{

}
