
public class ForLoopAndIfElseBlock {

	
	public static void main(String[] args) {
	
//1.uzd,
		for (int i = 0; i<10; i++){
			if (i==4){
				System.out.println("You find "+ i);
				break;
			}
		System.out.println(i);
		}
// 2.uzd.
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		for (int i = 0; i<10; i++){
			if (i==4){
				System.out.println("You find "+ i);
				continue;
			}
		System.out.println(i);
		}
		
		
	}

}
