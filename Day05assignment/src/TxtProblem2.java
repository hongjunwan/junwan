
public class TxtProblem2 {
	public static void main(String[] args) {
		
		int count =0;
		
		for(int x = 1; x <= 100; x++){
			if(x % 3 == 0 && x % 15 !=0 ){
				System.out.print(x + ":" + "* ");
				count++;
			}
			else if(x % 5 == 0 && x % 15 != 0){
				System.out.print(x + ":" + "# ");
				count++;
			}
			else if(x % 15 == 0){
				System.out.print(x + ":" + "(" +  x + ") ");
				count++;
			}
			if(count == 10){
				System.out.println();
				count = 0;
			}
		}
	}
}
