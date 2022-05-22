import java.util.Scanner;

public class bj1297_kjy {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double D = in.nextInt(); // 대각선 길이
        double H = in.nextInt(); // 높이
        double W = in.nextInt(); // 폭

        // D^2 = (H*ratio)^2 + (W*ratio)^2 (피타고라스 정의)
        // sqrt(ratio^2) = sqrt(D^2 / (H^2 + W^2))
        
        // sqrt == √
        double ratio = Math.sqrt(D * D / (H * H + W * W));
        // double형에서 int형으로 형변환
        System.out.println((int) (ratio * H) + " " + (int) (ratio * W));

    }
}
//수임 : 문제 푸시느라 수고하셨습니다!
//수아: 하하 주석 너무 좋아요!
