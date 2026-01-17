import java.util.Scanner;

class SumArr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int input[] = new int[n];
        int output[] = new int[n];

        System.out.println("Enter N numbers:");
        for (int i = 0; i < n; i++)
        {
            input[i] = sc.nextInt();
            int t = input[i];

            while (t > 0)
            {
                int d = t % 10;
                output[i] = output[i] + d;
                t = t / 10;
            }
        }

        // Printing result
        for (int i = 0; i < n; i++)
        {
            System.out.println("Sum of " + input[i] + " = " + output[i]);
        }

        sc.close();
    }
}
