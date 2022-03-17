package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Account2Test {

    @Test

    public void depositTest(){
        //given
        Account2 GoddsAccount = new Account2();
        //when
        GoddsAccount.deposit(1000);
        int balance = GoddsAccount.getBalance();
        //ascert
        assertEquals(1000,balance);
    }

    @Test
    public void doubleDepositTest() {
        //given
        Account2 GoddsAccount = new Account2();
        //when
        GoddsAccount.deposit(1000);
        GoddsAccount.deposit(500);
        int balance = GoddsAccount.getBalance();
        //ascert
        assertEquals(1500,balance);


    }

    @Test
    public void negativeDepositTest(){
        //given
        Account2 GoddsAccount = new Account2();
        //when
        GoddsAccount.deposit(-500);
        int balance = GoddsAccount.getBalance();
        //ascert
        assertEquals(0,balance);

    }

    @Test
    public void valid_InvalidDepositTest(){
        //given
        Account2 GoddsAccount = new Account2();
        //when
        GoddsAccount.deposit(1500);
        GoddsAccount.deposit(-500);
        int balance = GoddsAccount.getBalance();
        //ascert
        assertEquals(1500,balance);

    }

    @Test
    public void withdrawMethod(){
        //given
        Account2 GoddsAccount = new Account2();
        //when
        GoddsAccount.deposit(1500);
        GoddsAccount.withdraw(500);
        int balance = GoddsAccount.getBalance();
        //ascert
        assertEquals(1000,balance);
    }

    @Test
    public void withdrawAbnormally(){
        //given
        Account2 GoddsAccount = new Account2();
        //when
        GoddsAccount.deposit(1500);
        GoddsAccount.withdraw(2500);
        int balance = GoddsAccount.getBalance();
        //ascert
        assertEquals(1500,balance);
    }

}






//driver class
//ordinary class