package 第2回課題;
//String型のListかMapを作成して、その内容をコンソール画面 に表示
import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		ArrayList<String> lunch = new ArrayList<String>();
		lunch.add("和食");
		lunch.add("洋食");
		lunch.add("中華");
		System.out.println(lunch);
	}

}
