
public class OperatorEx7 {

	public static void main(String[] args) {
		
		//논리 연산자

		int n = 10;
	
		System.out.println(n >= 20 && n <= 20); //and	둘다 ture여만 true 앞 값이 false면 뒤에 값 실행x
		System.out.println(n >= 20 & n <= 20);  //      앞 값이 false여도 뒤에 값도 실행
		
		System.out.println(n >= 20 || n <= 20); //or	하나만 ture여도 true
		System.out.println(n >= 20 | n <= 20); 
		
	}

}