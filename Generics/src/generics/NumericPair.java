package generics;

public class NumericPair<K extends Number,V extends Number> implements Pair<K, V> {
	final private K key;
	final private V value;

	public NumericPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public V getValue() {
		return value;
	}

	public double sum() {
		return key.doubleValue() + value.doubleValue();
	}
}
