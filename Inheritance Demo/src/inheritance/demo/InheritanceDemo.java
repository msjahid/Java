/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.demo;

import account.BankAccount;
import account.CreditCard;
import account.CurrentAccount;

/**
 *
 * @author msjahid
 */
public class InheritanceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BankAccount a = new BankAccount(100, "Hasan", 1000.0);
       CurrentAccount b = new CurrentAccount(101, "Rakib", 1000.0, 20);
        CreditCard c = new CreditCard(102, "Ashiq", 0, 50000);
        c.withdraw(5000);
        c.deposit(2000);
        c.withdraw(65000);
        System.out.printf("%s\n", a);
        System.out.printf("%s\n", c);
       b.deposit(20);
       b.withdraw(10);
        System.out.printf("%s\n", b);
    }
    
}
