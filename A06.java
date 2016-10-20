import java.util.Scanner;
public class A06 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name=sc.nextLine();
		System.out.print("국어점수 입력 : ");
		int kor= sc.nextInt();
		System.out.print("수학점수 입력 : ");
		int math= sc.nextInt();
		System.out.print("영어점수 입력 : ");
		int eng= sc.nextInt();
		
		float avg= (float)(kor+math+eng)/3;
		String hak="";
		if(avg>=95)
			hak="A+";
		else if(avg>=90)
			hak="A";
		else if(avg>=85)
			hak="B+";
		else if(avg>=80)
			hak="B";
		else if(avg>=75)
			hak="C+";
		else if(avg>=70)
			hak="C";
		else hak="F";
		System.out.printf("[%s]님은 \n 평균은 %.1f이고 ,\n학점은 %s입니다",name,avg,hak );
	}
}
