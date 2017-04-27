package code.with.play;

public class Test {

	private static final byte[][] blocks = new byte[100][512];

	int getBlockSize100() {
		return blocks.length;

	}

	int getBlockSize512() {
		return blocks[0].length;
		// (0,0) (0,1) (0,2) ... (0,511)

	}

	public static void main(String[]args){

//		int q = new Test().getBlockSize100();
//		System.out.println(q);
//
//		int i = new Test().getBlockSize512();
//		System.out.println(i);


		blocks[0][0] = -128;
		blocks[99][511] = 127;

		byte[]block = new byte[100];
		byte[][]block_ = new byte[100][100];


		byte a = blocks[0][0];
		byte a1 = blocks[0][1];
		//....//
		byte a511 = blocks[0][511];


		byte[] b = blocks[0];
		byte [] b1 = blocks[99];

		System.out.println( b.length);
		System.out.println( b1.length);



		//System.out.println(blocks[99][511]);



	}




}
