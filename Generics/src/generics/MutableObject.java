package generics;

public class MutableObject<T> {
	private T value;

	public MutableObject(T initValue) {
		value = initValue;
	}

	public MutableObject() {
		this(null);
	}

	@Override
	public String toString() {
		return value==null?null:value.toString();
	}

	public T get() {
		return value;
	}

	public void set(T newValue) {
		value = newValue;
	}


}
