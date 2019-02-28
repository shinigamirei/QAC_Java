package com.qa.tests;

import java.util.Scanner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestRunner {

	public static void main(String[] args) {
		TestRunner runner = new TestRunner();
		runner.allTests();
		runner.takeInput();
	}

	public void allTests() {
		Result result = JUnitCore.runClasses(PlayerResult.class, DealerResult.class, MiscResult.class);

		System.out.println("All results passed: " + result.wasSuccessful());

		if (!result.wasSuccessful()) {
			System.out.println("Failed Tests:");
			for (Failure failure : result.getFailures()) {
				System.out.println(failure.getMessage());
			}
		}
	}

	public int takeInput() {
		Scanner sn = new Scanner(System.in);
		int input = sn.nextInt();
		if (input > 4) {
			return -1;
		}
		return input;

	}

}
