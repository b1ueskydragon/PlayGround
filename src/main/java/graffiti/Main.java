package graffiti;

/**
 * 単にクラスを二つ書いただけ(依存関係)
 */

class Account {
	String owner;
	public Account (String owner){
		this.owner = owner;
	}

}

public class Main {
	public static void main(String [] args) {
		Account a = new Account("ijrd1");
		System.out.println(a.owner);
	}

}
