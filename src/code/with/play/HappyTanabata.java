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


		swapMore(targetAry, 0, 0, new Character(tanabata.toCharArray()[0]).toString());
		swapMore(targetAry, 1, 1, new Character(tanabata.toCharArray()[1]).toString());
		swapMore(targetAry, 2, 2, new Character(tanabata.toCharArray()[2]).toString());
		swapMore(targetAry, 3, 3, new Character(tanabata.toCharArray()[3]).toString());
		swapMore(targetAry, 4, 4, new Character(tanabata.toCharArray()[4]).toString());
		swapMore(targetAry, 5, 5, new Character(tanabata.toCharArray()[5]).toString());
		swapMore(targetAry, 6, 6, new Character(tanabata.toCharArray()[6]).toString());
		swapMore(targetAry, 7, 7, new Character(tanabata.toCharArray()[7]).toString());

		int r = 1;
		while (r < targetAry.length) {
			swap(targetAry, 1, r);
			r++;
			if (targetAry[1].equals(ZERO)) {
				r = 0;
				break;
			}
		}

		String target = "";
		for (String el : targetAry) {
			target += el;
		}


		wellIsTanabata(target);

	}

}
