package programming4;


public class Test {
	public static void main(String[] args){
		try {	
			sub();
		}catch(MyException e)  {
			System.out.println("�ε��� �� ����");
		}
	}

	public static void sub() throws MyException {
		int[] array = new int[10];
		int i = array[10];
		throw new MyException("�ε��� �� ����");
		
	}
}

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
}
