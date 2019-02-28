package main;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class NumberManipulator {
	List<Integer> numListHund = new ArrayList<Integer>();
	List<Integer> numListThou = new ArrayList<Integer>();

	public NumberManipulator() {

	}

	public void oneToHundredArray() {

		for (int i = 0; i < 100; i++) {
			this.numListHund.add(i + 1);
		}
		System.out.println(this.numListHund);
	}

	public void HundredToNineNineNine() {
		for (int i = 100; i < 1000; i++) {
			this.numListThou.add(i);
		}
		System.out.println(this.numListThou);
	}

	public void timesTen() {
		this.numListThou = numListThou.stream().map(x -> x * 10).collect(Collectors.toList());
		System.out.println(numListThou);
	}
}
