
/**
 * 
 * @author TJ
 * 홀짝 판별 프로그램
 * if else 사용
 * =============
 * 입력하신 값은 ?
 * 홀입니다.
 * or
 * 짝입니다. 라고 출력
 */
public class FlowTest3 {

	public static void main(String[] args) {

		int input = 0;
		input = 21;
		System.out.println("입력하신 값은? " + input);
		
		if(input % 2 == 1) {
			System.out.println("홀입니다.");
		} else {
			System.out.println("짝입니다.");
		}
		
	}

}
