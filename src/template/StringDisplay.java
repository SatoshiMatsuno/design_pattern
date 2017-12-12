package template;

import java.nio.charset.Charset;

public class StringDisplay extends AbstractDisplay {

	private String string;
	private int width;

	public StringDisplay(String string, Charset charset) {
		this.string = string;
		this.width = string.getBytes(charset).length;

	}

	public void open() {
		printLine();
	}

	public void print() {
		System.out.println("|" + string + "|");
	}

	public void close() {
		printLine();
	}

	private void printLine() {

		System.out.print("+");

		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}

		System.out.println("+");

	}

}
