package factory_method.idcard;

import java.util.HashMap;

import factory_method.framework.Factory;
import factory_method.framework.Product;

public class IDCardFactory extends Factory {
	private HashMap<Integer, String> database = new HashMap<Integer, String>();
	private int serial = 100;

	protected synchronized Product createProduct(String owner) {
		return new IDCard(owner, serial++);
	}

	protected void registerProduct(Product product) {
		IDCard card = (IDCard) product;
		database.put(new Integer(card.getSerial()), card.getOwner());
	}

	public HashMap<Integer, String> getDatabase() {
		return database;
	}

}
