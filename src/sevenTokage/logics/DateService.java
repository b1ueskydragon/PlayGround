package sevenTokage.logics;

import java.util.Calendar;

/*
 * 時間によってトカゲたちの居場所が変わります。
 * タイマーを直接呼ばないでサービスを呼んで処理。
 */
public class DateService {

	Calendar calendar = Calendar.getInstance();

	public void whatTimeIsIt() {

		int hourOfDay = Calendar.HOUR_OF_DAY;

		isAfternoon(hourOfDay);
	}

	private void isAfternoon(int hourOfDay) {

		if (hourOfDay >= 0 && hourOfDay < 6) {
			//System.out.println(hourOfDay);
			System.out.println("夜明け");
		} else if (hourOfDay >= 6 && hourOfDay <= 12) {
			//System.out.println(hourOfDay);
			System.out.println("朝");
		} else if (hourOfDay > 12 && hourOfDay < 20) {
			//System.out.println(hourOfDay);
			System.out.println("午後");
			// Tea Time
			if (hourOfDay >= 14 && hourOfDay <= 15) {
				System.out.println("のTea Time !");
			}
		} else {
			//System.out.println(hourOfDay);
			System.out.println("夜");
		}

	}

}
