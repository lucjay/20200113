package co.lucjay.overloading;

public class Calculator {
	public int sum(int n, int m) {
		return n + m;
	}

	public int sum(int n, int m, int c) {
		return n + m + c;
	}

	public double sum(double d, double e) {
		return d + e;
	}

	public float sum(float x, float y) {
		return x + y;
	}

	public int multy(int n, int m) {
		return n * m;

	}

	public float multy(float n, float m) {
		return n * m;
	}
}
