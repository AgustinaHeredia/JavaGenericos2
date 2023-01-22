package Genericos;

public class GenericsMethods <T> {
	
	private T argumento1;
	private T argumento2;
	private T argumento3;

	public GenericsMethods (T argumento1, T argumento2, T argumento3) {
		this.argumento1 = argumento1;
		this.argumento2 = argumento2;
		this.argumento3 = argumento3;
	}

	public T getArgumento1() {
		return argumento1;
	}

	public void setArgumento1(T argumento1) {
		this.argumento1 = argumento1;
	}

	public T getArgumento2() {
		return argumento2;
	}

	public void setArgumento2(T argumento2) {
		this.argumento2 = argumento2;
	}

	public T getArgumento3() {
		return argumento3;
	}

	public void setArgumento3(T argumento3) {
		this.argumento3 = argumento3;
	}
	
	@Override
	public String toString () {
		return "El argumento1 es " +argumento1 + ", el argumento 2 es "+argumento2+" y el argumento 3 es "+argumento3;
	}
}
