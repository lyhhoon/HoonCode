
/**
 * 
 * @author TJ
 * 1인지 0 인지 판단하는 프로그램
 * 1과 그외의 값은 모두 켰다에 포함
 * 0이면 종료
 */
public class FlowTest2 {

	public static void main(String[] args) {

		int input = 0;
		input = 100;
		
		if(input != 0) {
			System.out.println("입력하신 값은 : " + input);
			System.out.println("전원을 켰습니다.");
		} else {
			System.out.println("입력하신 값은 : " + input);
			System.out.println("전원을 종료합니다.");
		}
		
	}

}
