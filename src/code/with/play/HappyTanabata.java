package code.with.play;

public class HappyTanabata {

	private static final String tanabata = "20170707";
	private static final String SEVEN = "7";
	private static final String ZERO = "0";
	private static final String TWO = "2";
	private static final String ONE = "1";

	private static boolean wellIsTanabata(String target) {

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

	private static void swapMore(String[] targetAry, int i) {
		// base case
		int targetIdx = i;
		String correct = new Character(tanabata.toCharArray()[i]).toString();
		System.out.println(i);

		// recursive case
		do {
			int r = targetIdx + 1;
			swap(targetAry, targetIdx, r);
			r++;
			if (targetAry[targetIdx].equals(correct)) {
				break;
			}
		} while (targetIdx + 1 < targetAry.length);

		swapMore(targetAry, i++);

	}

	public static void main(String[] args) {

		String[] targetAry = { SEVEN, TWO, SEVEN, ONE, ZERO, ZERO, ZERO, SEVEN };

		swapMore(targetAry, 0);

		String target = "";
		for (String el : targetAry) {
			target += el;
		}

		System.out.println(target);

		wellIsTanabata(target);

	}

}
