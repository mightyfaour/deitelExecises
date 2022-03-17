/*package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositTest() {
        //given
        Account philipAccount = new Account();
        //when
        philipAccount.deposit(100);
       //assert
        assertEquals(100, philipAccount.getBalance());

    }

    @Test
    public void depositTwiceTest(){
        Account philipAccount = new Account();
        philipAccount.deposit(500);
        philipAccount.deposit(400);
        assertEquals( 500+400, philipAccount.getBalance());
    }

    @Test
    @DisplayName("Test that negative number will not work")
    public void negativeDepositTest(){
        Account philipAccount = new Account();
        philipAccount.deposit(1000);
        philipAccount.deposit(-500);
        assertEquals( 1000, philipAccount.getBalance());
    }




        @Test
        public void withdrawTest() {
            Account philipAccount = new Account();
            philipAccount.withdraw(100);
            assertEquals(400, philipAccount.getBalance());
        }




}

*/