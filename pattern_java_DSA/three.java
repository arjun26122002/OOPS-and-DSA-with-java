import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of n: ");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i; j<n -i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
     } 
}
