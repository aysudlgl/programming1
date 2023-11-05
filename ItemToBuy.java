public class ItemToBuy {
	   private String itemName;
	    private int itemPrice;
	    private  int itemQuantity;

	    public ItemToBuy() {
	        this.itemName = "none";
	        this.itemPrice = 0;
	        this.itemQuantity =0;
	    }

	    public String getItemName() {
	        return itemName;
	    }

	    public void setItemName(String itemName) {
	        this.itemName = itemName;
	    }

	    public int getItemPrice() {
	        return itemPrice;
	    }

	    public void setItemPrice(int itemPrice) {
	        this.itemPrice = itemPrice;
	    }

	    public int getItemQuantity() {
	        return itemQuantity;
	    }

	    public void setItemQuantity(int itemQuantity) {
	        this.itemQuantity = itemQuantity;
	    }

	    @Override
	    public String toString() {
	        return  getItemName()+" "+getItemQuantity()+" @ $"+getItemPrice()+" = ";

	    }
	}
