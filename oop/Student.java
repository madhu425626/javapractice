public class StudentMain{
    public static void main(String []args){
        Student Ram = new Student();

        int id = Integer.parseInt(IO.readln("Enter Student ID: "));
        String name = IO.readln("Enter Student Name: ");
        int marks = Integer.parseInt(IO.readln("Enter Student Marks: "));

        Ram.setStudentData(id,name,marks);
        String result = Ram.display();
        IO.println(result);

    }
}

class Student{
    int studentId;
    String studentName;
    int studentMarks;
    char studentGrade;

    public void setStudentData(int id, String name, int marks){
        studentId = id;
        studentName = name;
        studentMarks = marks;
        getGrade(marks);
        

    }

    public void getGrade(int marks){
        if(marks>90){
            studentGrade = 'A';
        }
        else if(marks<=90 && marks>80){
            studentGrade = 'B';
        }
        else if(marks<=80 && marks>70){
            studentGrade = 'C';
        }
        else if(marks<=70 && marks>60){
            studentGrade = 'D';
        }
        else if(marks<=60){
            studentGrade = 'E';
        }
    }

    public String display(){
       return "[name="+studentName+",studentId="+studentId+",marks="+studentMarks+",grade="+studentGrade+"]";
    }
}
