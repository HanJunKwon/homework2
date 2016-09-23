import java.util.*;
public class A01{
	int age=0;

	public static void main(String[] args){
		new A01().start();
	}

	void start(){
		Scanner sc = new Scanner(System.in);
		System.out.print("출생년도 입력:");
		int year = sc.nextInt();
		
		this.age = 2016-year+1;
		print();		

	}


	void print(){
		if(age < 20)
			System.out.println("미성년자 입니다.");
		else
			System.out.println("미성년자가 아닙니다.");
	}
}
