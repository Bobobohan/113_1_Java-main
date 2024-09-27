import java.util.Scanner;
public class Level {
    public static void main(String[] args) {
        int score;
        char level = '\0'; 

        Scanner input = new Scanner(System.in);

        ystem.out.print("請輸入分數");
        int score = input.nextInt();

        if(score >= 90) {
            level = 'A';
        } 
        else if(score >= 80 && score < 90) {
            level = 'B';
        }
        else if(score >= 70 && score < 80) {
            level = 'C';
        }
        else if(score >= 60 && score < 70) {
            level = 'D';
        }        
        else {
            level = 'E';
        }
        System.out.printf("得分等級", level);
    }
        while input.hasNext(){
            System.out.print("請輸入分數");
        int score = input.nextInt();

        if(score >= 90) {
            level = 'A';
        } 
        else if(score >= 80 && score < 90) {
            level = 'B';
        }
        else if(score >= 70 && score < 80) {
            level = 'C';
        }
        else if(score >= 60 && score < 70) {
            level = 'D';
        }        
        else {
            level = 'E';
        }
        System.out.printf("得分等級", level);
    }

        }
        S
}
