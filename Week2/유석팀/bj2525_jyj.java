import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj2525_jyj {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		a += (b + c) / 60;
		if (a >= 24)
			a -= 24;
		b = (b + c) % 60;
		System.out.print(a + " " + b);
	}

}

/*
 *public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		
		m += s;
		if(m >= 60) {
			while(m >= 60) {
				m -= 60;
				h++;
				if(h >= 24) {
					h = 0;
				}
			}
		}
		System.out.println(h + " " + m);
	}
 */