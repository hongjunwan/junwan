
public class TxtProblem7 {
	public static void main(String[] args) {
		
		int z,s = 1;
		int result = 0;
		
		for(int x = 1; x <= 10; x++){
			z = x * 10;
			for(int y = s; y <= z; y++){
				result = result + y;
			}
			System.out.println("***" + s + "~" + z + "까지의 합***\n" + result);
			result = 0;
			s= s + 10;
		}
	}
}
