
/**
 * 
 * 60점 이상이면 합격입니다.
 * 60점 미만이면 불합격입니다. 라고 출력하는 프로그램
 * =====================================
 * 점수: 75
 * 합격입니다.
 * or
 * 점수: 59
 * 불합격입니다.
 *
 */
public class FlowTest1 {

	public static void main(String[] args) {

		int c = 0;
		c = 59;
		
		if(c >= 60) {
			System.out.println("점수: " + c);
			System.out.println("합격입니다.");
		}
		if(c < 60){
			System.out.println("점수: " + c);
			System.out.println("불합격입니다.");
		}
		
	}

}
