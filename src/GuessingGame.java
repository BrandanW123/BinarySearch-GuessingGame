import java.util.Random;

public class GuessingGame {
	public static void main(String[] args) {
	
int[] numSpace = new int[300];
		
		Random randGen = new Random();
		int match = randGen.nextInt(300) + 1;
		int k = 1;
		
		//Assigning numbers to Array
		for(int i = 0; i < numSpace.length; i++) {
				numSpace[i] = k;
				//System.out.printf("%4d", numSpace[i]);
				k++;			
		}
		System.out.println();
		
//Binary Search
		int o = 0; 
		int l = numSpace.length-1;
		int mid = ((l-o)/2);
		int c = numSpace[mid]; 
		//int c = match;
			
	while(l > o ) {
		if((numSpace[mid] == match)) {
			System.out.println();
			System.out.println();
			for(int p = 0; p <numSpace.length; p++) {
				if(p%12 == 0) {
					System.out.println();
				}
				if(numSpace[p] == match) {
					System.out.printf("%4d", numSpace[p]);
				}
				else {
					System.out.printf("%4s", "x");	
				}
				}            
			break;
		}
		else if(match > c) {
			o = mid +1;
			mid = (l+mid)/ 2;
			c = numSpace[mid];
			 
		}
		else if(match < c) {
			l = mid - 1;
			mid = (mid)/ 2;
			c = numSpace[mid];
		}
		System.out.println();
	
	
		for(int p = 0; p <numSpace.length; p++) {
		if(p%12 == 0) {
			System.out.println();
		}
		if((p>=o)&&(p<=l)) {
			System.out.printf("%4d", numSpace[p]);
		}
		else {
			System.out.printf("%4s", "x");	
		}
		}

		
	}
	
	}
}
		



