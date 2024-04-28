package umbcs680.hw4;
public class AcceptingCoinsState implements VendingMachineState {

    @Override
    public void insertCoin(double amount) {
        VendingMachineContext.getInstance().setTotalAmount(
            VendingMachineContext.getInstance().getTotalAmount() + amount);
    }

    @Override
    public void selectItem(String item) {
        VendingMachineContext.getInstance().setSelectedItem(item);
        VendingMachineContext.getInstance().setState(new SelectingItemState());
    }

    @Override
    public void dispenseItem() {
        throw new IllegalStateException("No item selected to dispense");
    }
}
