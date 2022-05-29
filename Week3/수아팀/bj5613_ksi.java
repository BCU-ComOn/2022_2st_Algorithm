import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
         int result=sc.nextInt();  //계산식 중 숫자 입력받기
    
         outline: while(true) {
            
                 String temp=sc.next(); //계산식 중 연산자 입력받기
                 if(temp.contentEquals("=")) {
                     break outline; //연산자가 =을 입력받았을 때 while문을 빠져나간다.
                 }
                 int b=sc.nextInt(); //계산식 중 숫자 입력받기
                
                 if(temp.contentEquals("/")){ result=result/b;} //temp이 /를 입력받았을 하는 식 
                 if(temp.contentEquals("+")){ result=result+b;} //temp이 +를 입력받았을 하는 식 
                 if(temp.contentEquals("-")){ result=result-b;} //temp이 -를 입력받았을 하는 식
                 if(temp.contentEquals("*")){ result=result*b;} //temp이 *를 입력받았을 하는 식
                     
                 }
             
            System.out.println(result); //최종 result안의 수를 출력한다. 
	}
}
//수아: while문과 if문으로 하셔서 저도 이해할 수 있었어용!