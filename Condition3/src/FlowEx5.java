import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {

		int scoreNum = 0;
		String grade = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력해주세요.");
		scoreNum = scan.nextInt();
		
		System.out.println("당신의 점수는 : " + scoreNum);
		
		if(scoreNum >= 90) {
			grade = "A";
			if(scoreNum >= 98) {
				grade += "+";
			}
		} else if(scoreNum >= 80) {
			grade = "B";
			if(scoreNum >=88) {
				grade += "+";
			} else if(scoreNum <84) {
				grade = grade + "-";
			}
		} else if(scoreNum >= 70) {
			grade = "C";
			if(scoreNum >=78) {
				grade += "+";
			}
		} else {
			grade = "F";
		}
		System.out.println("학점은 " + grade + "입니다.");
		
	}

}
