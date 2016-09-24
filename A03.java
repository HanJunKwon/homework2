import java.util.*;

public class A03{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("날수를 입력하세요 ");
		int days = sc.nextInt();

		int seconds = days*24*60*60;
		
		System.out.printf("날수에 해당되는 기간은 모두 %d 초입니다\n",seconds);
		
		int m_count=0;
		while(true){
			if(seconds>1000000){
				seconds-=1000000;
				++m_count;
			}
			else{
				System.out.printf("100만 초가 모두 %d번이나 포함됩니다.",m_count);
				break;
			}
		}
	}
}

