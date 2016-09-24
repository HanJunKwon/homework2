import java.util.Scanner;
public class A02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("온도를 입력하세요 ");
		double input_degree = sc.nextDouble();

		System.out.print("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요 ");
		String kind = sc.next();

		double output_degree=0.0;
		if(kind.equals("C"))
			output_degree = input_degree*1.8+32;
		
		else if(kind.equals("F"))
			output_degree = (input_degree-32)/1.8;

		System.out.printf("변환된 온도는 %.1f입니다", output_degree);
	}
}
