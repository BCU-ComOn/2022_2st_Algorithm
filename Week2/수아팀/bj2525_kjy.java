import java.util.Scanner;

public class bj2525_kjy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hour = in.nextInt();
        int min = in.nextInt();

        int needTime = in.nextInt();

        // 분에 필요한 분 추가
        min += needTime;

        // 60분 이상이면 60으로 나눈 몫을 hour에 덧셈
        if (min >= 60) {
            hour += min / 60;
            // 분을 60으로 나눈 나머지 계산
            min %= 60;
        }


        // 24시 이상일시 24로 나눈 나머지를 계산
        if (hour >= 24) {
            hour %= 24;
        }

        System.out.println(hour + " " + min);
    }
}
//수아: 이걸보니까 이해가 더 잘 가네요 ~