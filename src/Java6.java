import java.util.Random;

public class Java6 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt();
        int x = 0;
        if (num < 0){
            num = num * -1;
        }

        x = num % 6;
        x = x + 2;
        System.out.println(x);






        }





    }
