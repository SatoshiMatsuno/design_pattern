package singleton;

public class TicketMaker {
	private static TicketMaker singleton = new TicketMaker();
	private int ticketNum = 1000;

	private TicketMaker() {
		System.out.println("インスタンスを生成しました。");
	}

	public static TicketMaker getInstance() {
		return singleton;
	}

	public synchronized int getNextTicketNumber() {
		return ticketNum++;
	}

}
