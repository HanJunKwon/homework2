import java.util.*;

public class A04{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수를 입력하세요 ");
		int kor=sc.nextInt();
		System.out.print("영어 점수를 입력하세요 ");
		int eng=sc.nextInt();
		System.out.print("수학 점수를 입력하세요 ");
		int math=sc.nextInt();

		int sum = kor+eng+math;
		System.out.printf("입력하신 점수의 총점은 %d 이고, \n평균은 %.1f입니다.\n",sum,(double)sum/3);

		if(kor>=90)
			System.out.println("국어 점수가 우수합니다.");
		if(eng>=90)
			System.out.println("영어 점수가 우수합니다.");
		if(math>=90)	
			System.out.println("수학 점수가 우수합니다.");
	}
}
