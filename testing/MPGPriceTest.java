import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//Testing
class MPGPriceTest {

    @Test
    void testValidFillUpCost() {
        MPGPrice purchase = new MPGPrice(9.5, 3.50);
        //Testing filling up a 9.5 gallon vehicle at 3.50 dollars a gallon. Output should be $33.25
        // 0.001 is for floating-point comparison.
        assertEquals(40.00, purchase.calculateFillUpCost(), 0.001);
    }

    @Test
    void testZeroCapacityThrowsException() {
        MPGPrice purchase = new MPGPrice(0.0, 3.50);
        // Testing what happens when tank capacity is set at 0 (Should throw illegal argument) 
        assertThrows(IllegalArgumentException.class, () -> {
            purchase.calculateFillUpCost();
        });
    }
}
