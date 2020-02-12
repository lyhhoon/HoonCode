import java.util.Scanner;

public class OperatorEx12 {

	public static void main(String[] args) {
		
		// 사용자가 입력 할 변수
		int userInput = 0;
		// 임시 결과
		int tempNum = 0;
		// 사용자가 입력한 값에 대한 출력 결과
		String result = "";
		String userName = "";
		
		//키보드 입력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("홀짝 판별 프로그램 시작");
		
		System.out.println("고객님 성함을 알려주세요.");
		userName = scan.nextLine();
		
		System.out.println(userName +"님 원하시는 숫자를 입력해주세요. ");
		userInput = scan.nextInt();
		
		// 판별을 위한 과정
		tempNum = userInput % 2;
		
		// 사용자가 입력한 값에 대한 홀짝 판별 결과
		result = (tempNum == 0) ? "짝" : "홀";
		
		System.out.println(result);
		System.out.println("고객님이 입력하신 값은 " + userInput + "입니다.");
		
	}

}