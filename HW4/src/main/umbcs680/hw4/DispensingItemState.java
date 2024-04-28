package umbcs680.hw4;
public class DispensingItemState implements VendingMachineState {

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
        System.out.println("Dispensing item: " + VendingMachineContext.getInstance().getSelectedItem());
        VendingMachineContext.getInstance().setSelectedItem(null);
        VendingMachineContext.getInstance().setState(new IdleState());
    }
}
