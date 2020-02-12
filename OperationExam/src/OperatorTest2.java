
public class OperatorTest2 {

	public static void main(String[] args) {
		
		//1인지 0인지 판단하는 프로그램
		
		int input = 5;
		String str = "";
		//삼항연산자를 이용하여
		
		//입력하신 값은 1
		//1이면 전원을 켰습니다.
		
		//입력하신 값은 0
		//0이면 전원을 종료합니다.
		
//		input = 1;
//		str = (input == 1) ? input + "\n전원을 켰습니다." : input + "\n전원을 종료합니다.";
	
//		System.out.println("입력하신 값은 : " + str);
		
		//다중 삼항연산자
		
		str = (input == 1) ? "입력하신 값은 " + input + "\n전원을 켰습니다."
				: (input == 0) ? "입력하신 값은 " + input + "\n 전원을 종료합니다."
					: "입력하신 값은 " + input + "\n잘못입력하였습니다.";
		
		System.out.println(str);
	}

}
