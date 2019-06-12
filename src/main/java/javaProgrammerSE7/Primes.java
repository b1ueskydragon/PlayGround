package javaProgrammerSE7;

import java.util.ArrayList;
import java.util.List;

public class Primes {
	public static void main(String[] args) {
		List p = new ArrayList(); // 引数が必要なraw型
		p.add(7);
		p.add(2);
		p.add(5);
		p.add(2); // ここまではOK printlnも問題なし
		//p.sort(); // List.sortは引数 () に適用できません
		System.out.println(p);
	}

}
