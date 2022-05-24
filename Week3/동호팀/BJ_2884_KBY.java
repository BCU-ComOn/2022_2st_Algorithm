import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        int a= in.nextInt();
        int b= in.nextInt();

        if(b<45){
            a--;
            b=60-(45-b);
            if(a<0){
                a=23;
            }
            
            System.out.println(a+" "+b);
        }
        else {
            System.out.println(a+" "+(b-45));
        }
    }
}

//학민:수고하셨습니다:)