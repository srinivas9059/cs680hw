public interface VendingMachineState {
    void insertCoin(double amount);
    void selectItem(String item);
    void dispenseItem();
}
