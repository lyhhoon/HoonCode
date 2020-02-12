import java.util.Scanner;

/**
 * 
 * @author TJ
 * 100 ~ 90점 이상이면 A학점
 * 90미만 80점 이상이면 B학점
 * 79점 이하 70점 이상이면 C학점
 * 그 외는 F학점
 * 
 * if문 사용 사용자 입력을 점수로 받는다.
 * ============================
 * 당신의 점수는 70
 * 학점은 C 입니다.
 * 
 */
public class FlowTest4 {

	public static void main(String[] args) {

		int input = 0;
		String grade = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력해주세요.");
		input = scan.nextInt();
		
		System.out.println("당신의 점수는 : " + input);
		
		if(input <= 100 && input >= 90) {
			grade = "A";
		} else if(input < 90 && input >= 80) {
			grade = "B";
		} else if(input <= 79 && input >= 70) {
			grade = "C";
		} else {
			grade = "F";
		}
		System.out.println("학점은 " + grade + "입니다.");
		
	}

}
