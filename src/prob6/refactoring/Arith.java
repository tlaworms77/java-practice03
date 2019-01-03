package prob6.refactoring;

public abstract class Arith {
	protected int a; // 자식입장에서는 사용해야되니 setter/getter를 안만들었다
	protected int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public abstract int calculate();
}
