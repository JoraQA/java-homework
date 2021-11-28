import java.util.Scanner;

public class Java7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > 10 && b != 10) {
            System.out.println("Both a and b legal");
        } else if(a > 10 || b!=10) {
            System.out.println(" a illegal b is llegal");
        }
        else if(a > 10 && b== 10){
            System.out.println("a is llegal b is illegal");


        }
    }
}
