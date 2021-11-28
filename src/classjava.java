import java.util.Scanner;

public class classjava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte p =(byte) 3.14159;
         int radius = scanner.nextInt();
         int area = p * radius * radius;
         int perimetr = 2 * p * radius;
         System.out.println(area);
         System.out.println(perimetr);
    }
}
