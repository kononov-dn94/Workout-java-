/*package com.javacode.collections.autoboxing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;*/

public class CollectionMain {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		List.add(Integer.valueOf(1));

		Integer integ = 56;
		int n = integ.Value();
		Double doub = 56.567;
		double d = doub.doubValue();

		String[] colors = {"yellow", "green", "blue"};

		LinkedList<String> ll = new LinkedList<>(Arrays.asList(colors));
		ll.add("black");

		collors = ll.toArray(new String[ll.size()]);

		for (int i = 0; i < colors.length; i++) {
			System.out.println(colors[i]);
		}
	}
}
