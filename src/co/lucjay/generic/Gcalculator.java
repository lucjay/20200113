package co.lucjay.generic;

public class Gcalculator<T, V> {
	public <T extends Number> int sum(T t1, T t2) {
		int v1 = t1.intValue();
		int v2 = t2.intValue();
		return v1 + v2;
	}
}
