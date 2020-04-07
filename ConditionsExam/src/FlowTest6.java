
/**
 * 
 * @author TJ
 * 0.0 ~ 0.9 ) + 1
 */
public class FlowTest6 {

	public static void main(String[] args) {

		int score = (int)(Math.random()* 6) + 1;
		
		switch (score) {
			case 1:
				System.out.println("1칸 전진");
				break;
			case 2:
				System.out.println("2칸 전진");
				break;
			case 3:
				System.out.println("3칸 전진");
				break;
			case 4:
				System.out.println("4칸 전진");
				break;
			case 5:
				System.out.println("5칸 전진");
				break;
			case 6:
				System.out.println("6칸 전진");
				break;
			default:
				break;
		}
		
	}

}
