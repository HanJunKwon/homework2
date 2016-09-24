import java.util.Scanner;
public class A05{
	int age=0;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요 ");
		int birth_year = sc.nextInt();
		int age = 2016-birth_year+1;
		
		if(age<7)
			System.out.println("유아");
		else if(age<13)
			System.out.println("어린이");
		else if(age<20)
			System.out.println("청소년");
		else if(age<30)
			System.out.println("청년");
		else if(age<60)
			System.out.println("중년");
		else
			System.out.println("노년");
	}
}
