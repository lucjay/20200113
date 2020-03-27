package co.lucjay.generic;

import co.lucjay.overloading.Calculator;

public class MainApp {

	public static void main(String[] args) {
		GenericTest<String> box = new GenericTest<String>();
		box.set("hello");
		System.out.println(box.get());

		GenericTest<Integer> i = new GenericTest<Integer>();
		i.set(Integer.valueOf(5));
		System.out.println(i.get() + 10);

		Calculator calculator = new Calculator();
		int n = calculator.sum(10, 20);
		double sum = calculator.sum(12.3, 21.2);
		System.out.println(n);
		System.out.println(sum);

		Gcalculator gc = new Gcalculator();
		int a = (int) gc.sum(200, 300);
		float su = (float)gc.sum(21.5f, 30.4f);
	}

}
