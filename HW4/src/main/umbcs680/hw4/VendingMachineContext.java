package umbcs680.hw4;
public class VendingMachineContext {
    private static VendingMachineContext instance;
    private VendingMachineState currentState;
    private double totalAmount;
    private String selectedItem;

    private VendingMachineContext() {
        // Private constructor to enforce singleton pattern
        this.currentState = new IdleState();
        this.totalAmount = 0.0;
        this.selectedItem = null;
    }

    public static VendingMachineContext getInstance() {
        if (instance == null) {
            instance = new VendingMachineContext();
        }
        return instance;
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public void insertCoin(double amount) {
        currentState.insertCoin(amount);
    }

    public void selectItem(String item) {
        if (selectedItem != null) {
            throw new IllegalStateException("Item already selected");
        }
        currentState.selectItem(item);
    }
     // Method to return coins and reset the total amount
     public void returnCoins() {
        this.totalAmount = 0.0; // Reset the total amount
        this.currentState = new IdleState();
      } // Change state to Idle
        
    public void dispenseItem() {
        if (selectedItem == null) {
            throw new IllegalStateException("No item selected");
        }
        currentState.dispenseItem();
    }
    
    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }
}
