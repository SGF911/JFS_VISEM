import java.util.Scanner;

public class ClassTopper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of subjects (m): ");
        int m = scanner.nextInt();

        String[] names = new String[n];
        int[][] marks = new int[n][m];

        String topperName = "";
        int highestTotal = -1;

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter name for student " + (i + 1) + ": ");
            names[i] = scanner.next();

            int currentStudentTotal = 0;
            System.out.println("Enter marks for " + m + " subjects:");
            for (int j = 0; j < m; j++) {
                marks[i][j] = scanner.nextInt();
                currentStudentTotal += marks[i][j];
            }

            if (currentStudentTotal > highestTotal) {
                highestTotal = currentStudentTotal;
                topperName = names[i];
            }
        }

        System.out.println("\n-----------------------------");
        System.out.println("The topper is: " + topperName);
        System.out.println("Total Marks obtained: " + highestTotal);
        System.out.println("-----------------------------");

        scanner.close();
    }
}
