package umbcs680.hw4;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VendingMachineTest {

    private VendingMachineContext vendingMachine;

    @BeforeEach
    public void setUp() {
        vendingMachine = VendingMachineContext.getInstance();
    }

    @Test
    public void testInsertCoin() {
        vendingMachine.insertCoin(1.0);
        vendingMachine.insertCoin(0.5);
        assertEquals(1.5, vendingMachine.getTotalAmount());
    }

    @Test
    public void testDispenseItemWithoutSelection() {
        assertThrows(IllegalStateException.class, () -> {
            vendingMachine.dispenseItem();
        });
    }

    @Test
    public void testSelectItem() {
        vendingMachine.selectItem("Soda");
        assertEquals("Soda", vendingMachine.getSelectedItem(), "Selected item should be 'Soda'");
    }
   

}
