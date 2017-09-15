package test02;

//클래스 작성 시점에는 아직 자료형이 미정 상태임.
public class Box<T> {
	private T data;
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}

}
