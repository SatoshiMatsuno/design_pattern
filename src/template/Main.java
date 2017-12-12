package template;

import java.nio.charset.Charset;

public class Main {
	public static void main(String[] args) {

		// 各インスタンス生成
		AbstractDisplay charDisplay = new CharDisplay('H');

		AbstractDisplay stringDisplayEng = new StringDisplay("Hello, world!", Charset.forName("UTF-8"));

		AbstractDisplay stringDisplayJp = new StringDisplay("こんにちは!", Charset.forName("Shift_JIS"));

		// 文字及び文字列表示処理。
		charDisplay.display();

		stringDisplayEng.display();

		stringDisplayJp.display();

	}

}
