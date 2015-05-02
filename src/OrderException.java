
public class OrderException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OrderException(String s){
		super(s);
		createOrder();
	}
	
	public void createOrder(){
		Voorraadbeheer.beslist.add(new Bestelling());
	}

}
