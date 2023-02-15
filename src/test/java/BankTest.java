
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    @Test
void testAddAcountToClient(){
        Client cliente= new Client("Mario", 16, 0,2000);
        Account account = new Account(1,2000);
        Account account2 = new Account(2,2000);
        assertAll(
                ()-> assertTrue(cliente.addAccount(account, account2)),
                ()-> assertTrue(cliente.getAccounts().contains(account)),
                ()-> assertTrue(cliente.getAccounts().contains(account2)),
                ()-> assertEquals(2,cliente.getAccounts().size()),
                () -> assertThrows(ArrayStoreException.class , () -> cliente.addAccount(account)),
                ()-> assertEquals(2,cliente.getAccounts().size())
        );
}
}