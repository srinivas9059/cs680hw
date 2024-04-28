package umbcs680.hw4;
public class IdleState implements VendingMachineState {

    @Override
    public void insertCoin(double amount) {
        VendingMachineContext.getInstance().setTotalAmount(amount);
        VendingMachineContext.getInstance().setState(new AcceptingCoinsState());
    }

    @Override
    public void selectItem(String item) {
        throw new IllegalStateException("Cannot select item without inserting coins");
    }

    @Override
    public void dispenseItem() {
        throw new IllegalStateException("No item selected to dispense");
    }
}
