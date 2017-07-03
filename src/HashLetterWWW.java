import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashLetterWWW {

	public void letterReader(String letterPath) {

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(new File(letterPath)));

			String line = null;
			while ((line = br.readLine()) != null) {

				System.out.println(createHash(line));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String createHash(String letter) {

		byte[] strBytes = letter.getBytes();
		MessageDigest md;
		String hashedLetter = null;
		try {
			md = MessageDigest.getInstance("MD5");
			byte[] mdBytes = md.digest(strBytes);
			BigInteger bigInt = new BigInteger(1, mdBytes);
			hashedLetter = new String(String.format("%032x", bigInt));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return hashedLetter;

	}

	public static void main(String[] args) {

		new HashLetterWWW().letterReader(StaticPath.letterPath);

		 //   /|_/|   みえのそばに             //
		//   (・・ ）    ちゃんいな            //
	   //     |   |      みえとそば食べたい   //
	  //                                 //

	}

}
