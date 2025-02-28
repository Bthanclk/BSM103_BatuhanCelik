public class Stock {

	private String store;
	private int totalProduct;
	private int totalCost;

	public Stock(String thestore) {
		if (thestore == null) {
			throw new NullPointerException();
		}
		store = thestore;
		totalProduct = 0;
		totalCost = 0;

	}

	public int getProfit(int currentPrice) {
		if (currentPrice < 0) {
			throw new IllegalArgumentException();
		}
		int marketValue = totalProduct * currentPrice;
		return marketValue;
	}

	public void purchase(int shares, int pricePerShare) {
		if (shares < 0 || pricePerShare < 0) {
			throw new IllegalArgumentException();
		}

		totalProduct += shares;
		totalCost += shares * pricePerShare;

	}

}