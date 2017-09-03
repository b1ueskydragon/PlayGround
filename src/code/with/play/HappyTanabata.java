package code.with.play;

import java.util.Arrays;
import java.util.List;

public class HappyTanabata {

	private static final String tanabata = "20170707";
	private static final String SEVEN = "7";
	private static final String ZERO = "0";
	private static final String TWO = "2";
	private static final String ONE = "1";

	private static boolean isTanabata(String target) {

		if (target.equals(tanabata)) {
			System.out.println("Happy Tanabata ! " + target);
			return true;
		}
		return false;
	}

	private static void swap(String[] target, int idx1, int idx2) {
		String box = target[idx1];
		target[idx1] = target[idx2];
		target[idx2] = box;
	}

	private static void swapMore(String[] targetAry, int i, int targetIdx, String correct) {
		while (i < targetAry.length) {
			swap(targetAry, targetIdx, i);
			i++;
			if (targetAry[targetIdx].equals(correct)) {
				break;
			}
		}
	}

	public static void main(String[] args) {

		String[] targetAry = { SEVEN, SEVEN, SEVEN, ZERO, ZERO, ZERO, TWO, ONE };

		for (int i = 0; i < tanabata.length(); i++) {
			swapMore(targetAry, i, i, Character.toString(tanabata.toCharArray()[i]));
		}

		String target = "";
		for (String el : targetAry) {
			target += el;
		}

		isTanabata(target);
	}

}
