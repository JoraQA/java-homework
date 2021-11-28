import java.util.Scanner;

public class Javaaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a % 7 == 0 || b % 7 == 0) {
            if ((a > 0 && b > 0) && (a > b)) {
                int x = a - b;
                if(x%2 == 1){
                    for(int i = 0; x < 0; i = i - 2){
                        System.out.println();
                    }
                }

            }
        }


    }
}