package adapter.adapter_study;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {

		FileIO f = new FileProperties();

		try {
			f.readFromFile("adpter_study_file.txt");
			f.setValue("year", "2017");
			f.setValue("month", "12");
			f.setValue("day", "1");
			f.writetoFile("adpter_study_newfile.txt");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
