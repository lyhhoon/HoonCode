import java.util.Scanner;

/**
 * 
 * @author TJ
 * 성적 처리 프로그램
 * 90점 이상이면 A학점
 * 80점 이상이면 B학점
 * 70점 이상이면 C학점
 * 그 외는 F학점
 * 
 * if문 사용
 * 사용자 입력을 점수로 받는다.
 * ================
 * 당신의 점수는 70
 * 학점은 C입니다.
 * 
 */
public class FlowTest5 {

	public static void main(String[] args) {

		int input = 0;
		String g = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력해주세요.");
		input = scan.nextInt();
		
		System.out.println("당신의 점수는 : " + input);
		
		if(input >= 90) {
			g = "A";
		} else if(input >= 80) {
			g = "B";
		} else if(input >= 70) {
			g = "C";
		} else {
			g = "F";
		}
		System.out.println("학점은 " + g + "입니다.");
		
	}

}
