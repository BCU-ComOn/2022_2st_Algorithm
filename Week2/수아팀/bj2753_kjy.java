import java.util.Scanner;

public class bj2753_kjy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        // 4의 배수이면서, 
        if (year % 4 == 0) {
            //(100의 배수가 아닐 때) 또는 (400의 배수일 때이다.)
            if (!(year % 100 == 0) || (year % 400 == 0)) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }

    }

}
//수아 : 오...굉장히 좋은 코드의 냄새가 나네요..
