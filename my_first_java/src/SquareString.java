import java.util.Scanner;

public class SquareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine(); 

        while (testcase > 0) {
            testcase--;
            String s = sc.nextLine();
            int length = s.length();
            int midIndex = length / 2;

            if (length % 2 == 0) {
                String firstHalf = s.substring(0, midIndex);
                String secondHalf = s.substring(midIndex);

                if (firstHalf.equals(secondHalf)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
