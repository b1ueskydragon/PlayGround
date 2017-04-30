package sevenTokage.logics;

import java.util.Calendar;
import java.util.Date;

/*
 * 時間によってトカゲたちの居場所が変わります。
 * タイマーを直接呼ばないでサービスを呼んで処理。
 */
public class DateService {

	Calendar calendar = Calendar.getInstance();

	public String getDay(){

		// if else elseif

		return "Afternonn";
	}


	private void whatTimeIsIt(){

		Date now = calendar.getTime();

		// morning, noon, afternoon にわけて getDayに渡す


		System.out.println(calendar.getTime());


	}

	public static void main(String[]args){

		new DateService().whatTimeIsIt();


	}

}
