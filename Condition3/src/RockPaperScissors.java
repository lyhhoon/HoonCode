import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {

		int user = 0;
		int com = 0;
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요>");
		user = scan.nextInt();
		
		System.out.println("컴퓨터도 선택했습니다.");
		com = (int)(Math.random() * 3) + 1;
		
		String userChoiceSt = "";
		switch (user) {
			case 1:
				userChoiceSt = "가위";
				break;
			case 2:
				userChoiceSt = "바위";
				break;
			case 3:
				userChoiceSt = "보";
				break;
		}
		
		String comChoiceSt = "";
		switch (com) {
			case 1:
				comChoiceSt = "가위";
				break;
			case 2:
				comChoiceSt = "바위";
				break;
			case 3:
				comChoiceSt = "보";
				break;
		}
		
		System.out.println("당신은 " + userChoiceSt + " 입니다.");
		System.out.println("com은 " + comChoiceSt + "입니다.");
		
		String msgStr = "";
		
		switch (user - com) {
			case 2: case -1:
				msgStr = "당신이 졌습니다.";
				break;
			case 1: case -2:
				msgStr = "당신이 이겼습니다.";
				break;
			case 0:
				msgStr = "비겼습니다.";
				break;
		}
		System.out.println(msgStr);
	}

}