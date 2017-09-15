/*
     *
    **
   ***
  ****
 *****
 */
public class Problem3 {
	public static void main(String[] args) {
		
		int qow = 0;
		
		System.out.println("*ž");
		
		for(int x = 4; 0 <= x; x--){
			for(int z = 0; z < x; z++){
				System.out.print(" ");
				qow++;
			}
			
			for(int y = 0; y <= 4 - (qow); y++){
				System.out.print("*");
			}
			System.out.println();
			qow = 0;
		}
	}
}

