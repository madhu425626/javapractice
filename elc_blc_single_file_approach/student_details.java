public class Elc {

    public static void main(String[] args) {

        int roll = Integer.parseInt(IO.readln());
        String name = IO.readln();
        Double fees = Double.parseDouble(IO.readln());
        int totalMarks = Integer.parseInt(IO.readln());

        IO.println(
            Blc.getStudentDetails(roll, name, fees, totalMarks)
        );
    }
}


class Blc {

    static String getStudentDetails(
            int roll,
            String name,
            double fees,
            int totalMarks) {

        char grade = 'A';

        if (totalMarks >= 75) {
            grade = 'A';

        } else if (totalMarks >= 50 && totalMarks <= 75) {
            grade = 'B';

        } else {
            grade = 'C';
        }

        return "[ Roll:" + roll+ ", Name:" + name+ ", Fees:" + fees+ ", TotalMarks:" + totalMarks+ ", Grade:" + grade + " ]";
    }
}
