package quiz;

/**
 * Get the source-code on nobugsproject.com
 */
public class LogicalOperatorsChallenge {

	public static void main(String[]args){

		int spiderMan = 10;
		int venom = 5;

		int carnage = 50;

		if(spiderMan == 11 & venom++ ==5){
			venom++;
		}
		// venom = 7

		if(++carnage == 50 | spiderMan++ == 11 | spiderMan++ == 12
				| spiderMan++ == 13 | spiderMan++ ==14){
			venom++;
		}
		// carnage=51
		// spiderMan = 15

		if(++spiderMan == 14 | spiderMan++ ==15 & venom++ ==6 & spiderMan ==13){
			spiderMan++;
		}
		// spiderMan = 16
		//


		System.out.println(spiderMan + venom + carnage); // 74

	}

}
