import java.security.SecureRandom;

public class SecureRandomDemo{
    public static void main(String[] args) {
        while(true) {//永遠不停地執行
            var number = randomNumber.nextInt(10);
            System.out.println(number);
            
            if(number == 5) {
                System.out.println("I hit 5....Orz");
                break;
            }
        }
    }
}
