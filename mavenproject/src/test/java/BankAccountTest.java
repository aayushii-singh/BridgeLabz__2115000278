import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount(100.0);
    }

    @Test
    public void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        account.withdraw(40.0);
        assertEquals(60.0, account.getBalance());
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(200.0));
    }

    @Test
    public void testNegativeDeposit() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-10.0));
    }

    @Test
    public void testNegativeWithdraw() {
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-10.0));
    }
}
