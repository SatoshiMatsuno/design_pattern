package adapter.adapter_study;

import java.io.*;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {

	public void readFromFile(String fileName) throws IOException {
		load(new FileInputStream(fileName));
	}

	public void writetoFile(String fileName) throws IOException {
		store(new FileOutputStream(fileName), "wrriten by FileProperties");
	}

	public void setValue(String key, String value) {
		setProperty(key, value);
	}

	public String getValue(String key) {
		return getProperty(key, "");
	}

}
