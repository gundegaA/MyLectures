
public class Primes {

	
	public static void main(String[] args) {
		
		int n =2000000;
		long sum = 2;
		
		for(int i=3;i<=n;i++){
			int sk =0;
			for (int j=2;j<Math.sqrt(i)+1;j++){
				
				
				if (i%j==0){
					sk =sk+1;
				}else{
					sk =sk+0;
				}
			}
			if (sk==0){
				System.out.println("prime is: "+i);
				sum = sum+i;
			}
			
			
			
			
		}
		System.out.println("sum: "+sum);

	}

}
