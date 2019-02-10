/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testassignment1;

/**
 *
 * @author Hallur
 */
public class Methods {

    public double calculateYearlyIntereset(Account account){
        
        int balance = account.getBalance();
        if (balance >= 0) {
            if (balance <= 100) {
                return balance*0.03;
            }
            if (balance > 100 && balance <= 1000) {
                return balance*0.05;
            }
            if (balance > 1000) {
                return balance*0.07;
            }
        }
    
        return 0.0;
    }
}
