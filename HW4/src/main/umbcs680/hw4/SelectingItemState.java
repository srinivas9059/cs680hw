package umbcs680.hw4;
public class SelectingItemState implements VendingMachineState {

    @Override
    public void insertCoin(double amount) {
        throw new IllegalStateException("Coins already inserted");
    }

    @Override
    public void selectItem(String item) {
        throw new IllegalStateException("Item already selected");
    }

    @Override
    public void dispenseItem() {
        if (VendingMachineContext.getInstance().getSelectedItem() == null) {
            throw new IllegalStateException("No item selected to dispense");
        }
        VendingMachineContext.getInstance().setState(new DispensingItemState());
    }
}
