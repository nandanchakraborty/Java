import java.util.Scanner;

public class onlyPluses {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int maxProduct = 0;

            for (int i = 0; i <= 5; i++) {
                for (int j = 0; j <= 5 - i; j++) {
                    int k = 5 - i - j;
                    int newA = a + i;
                    int newB = b + j;
                    int newC = c + k;
                    int product = newA * newB * newC;
                    maxProduct = Math.max(maxProduct, product);
                }
            }

            System.out.println(maxProduct);
        }

        scanner.close();
    }
}

