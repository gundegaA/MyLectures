public class ForEach {

	
	public static void main(String[] args) {
		
		/**int[] marks= {45,76,87,34,66,87,100};
//for each loop var:array
		for(int mark : marks){
			System.out.println(mark);
		}
		System.out.println("--------------------------");
		System.out.print("[");
		for (int i=0;  i < marks.length-1; i++ ){
			System.out.print(marks[i]+", ");
		}
		System.out.print(marks[marks.length-1]+"]");
		*/
		
		int[] marks= {45,60,87,34,6,87,60,77,6};
		
		int x=6;
		
		/**for (int i=0; i<marks.length; i++){
			if (marks[i]==x){
				System.out.println("SIX");
			}else {
				System.out.println("No number!");
			}
			*/
		int a =0;
		for (int i=0; i<marks.length; i++){
			if (marks[i]!=x){
				
				a= a+1;
			}else {
				System.out.println("SIX");
				
			}
			if (marks.length==a){
				System.out.println("There is no match!");
			
			}
		
		}
	}

}
