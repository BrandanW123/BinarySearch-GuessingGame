import java.util.Random;
public class Main {
	/*public static void printNums(int [] numSpace, int l, int o, int c, int match) {
		System.out.println();
		for(int p = 0; p <numSpace.length; p++) {
		      if(p%25 == 0) {
					System.out.println();	
				}
				if(match == numSpace[p]){
					System.out.printf("%4d", numSpace[p]);
				}
				else {
					System.out.printf("%4s", "x");	
				}
				
				}
	}
	*/
	public static void binarySearch(int[] numSpace,int l,int o,int c,int match){
		while(l >= o) {
		    int mid = ((l-o)/2);
			if(numSpace[mid] == match) {
				System.out.println(numSpace[mid]);            
				break;
			}
			else if(numSpace[mid] > c) {
				o = mid +1;	
						}
			else if(numSpace[mid] < c) {
				l = mid - 1;
				}			
			}
	}
			
	public static void main(String[] args) {
		
		
		int[] numSpace = new int[300];
		
		Random randGen = new Random();
		int match = randGen.nextInt(300) + 1;
		int k = 1;
		
		//Assigning numbers to Array
		for(int i = 0; i < numSpace.length; i++) {
				numSpace[i] = k;
				k++;			
		}
		
//Binary Search
		
		int o = 0; 
		int l = numSpace.length-1;
		int c = match;
/*
 
	while(l >= o) {
    int mid = ((l-o)/2);
		if(numSpace[mid] == match) {
			//System.out.println();
			System.out.println(numSpace[mid]);            
			break;
		}
		else if(numSpace[mid] > c) {
			o = mid +1;
			//mid = (l+mid)/ 2;
			// c = numSpace[mid];
			 
		}
		else if(numSpace[mid] < c) {
			l = mid - 1;
			//mid = (mid)/ 2;
			 //c = numSpace[mid];
		}
		
  }*/

		
		binarySearch(numSpace, l, o, c, match);
		
  System.out.println();

		for(int p = 0; p <numSpace.length; p++) {
			
      if(p%25 == 0) {
			System.out.println();	
		}
		if(match == numSpace[p]) {
			//System.out.print(numSpace[p] + " ");
			System.out.printf(" %4d", numSpace[p]);
		}
		else {
			//System.out.print("x" + " ");
			System.out.printf("%4s", "x");	
		}
	
		
		}
		//System.out.println();

		
	}

}
