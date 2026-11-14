
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][];

        // Read 3 rows
        for (int i = 0; i < 3; i++) {
            int size = sc.nextInt();

            if (size < 0) {
                System.out.println("Invalid input");
                return;
            }

            arr[i] = new int[size];

            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Display jagged array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
