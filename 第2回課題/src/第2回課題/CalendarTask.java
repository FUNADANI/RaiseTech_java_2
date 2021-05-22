package 第2回課題;
//「3年後の今日が何曜日なのか」を計算して表示
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CalendarTask {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 E曜日");
		String todayformat = today.format( pattern );
		System.out.println("今日は、" + todayformat + "です。");
				
		System.out.println("3年後の今日は・・・");
		today = today.plusYears(3); 
		DayOfWeek week = today.getDayOfWeek();
		switch (week) {
		  case SUNDAY:
			  	System.out.println("日曜日");
			  	break;
		  case MONDAY:
				System.out.println("月曜日");
				break;
		  case TUESDAY:
				System.out.println("火曜日");
				break;
		  case WEDNESDAY:
				System.out.println("水曜日");
				break;
		  case THURSDAY:
				System.out.println("木曜日");
				break;
		  case FRIDAY:
				System.out.println("金曜日");
				break;
		  case SATURDAY:
				System.out.println("土曜日");
				break;
		}
	}

}
