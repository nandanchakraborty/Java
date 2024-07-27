import java.util.Scanner;

public class legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int leg = sc.nextInt();
            int animal = leg/4;
            int last = leg%4;
            int ar = last/2;
            System.out.println(animal+ar);

        }
    }
}
