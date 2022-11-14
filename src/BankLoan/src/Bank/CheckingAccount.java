/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

import java.util.Random;


//this class inherits Account class
public class CheckingAccount extends Account  {
    //attributes
     private String CardNo;
     
     //constructors
    public CheckingAccount(String accountType, String name, double amount, long ID) {
        super(accountType, name, amount, ID);
    }
     
    public CheckingAccount(String accountType, String name, double amount, long ID,String CardNo) {
        super(accountType, name, amount, ID);
        this.CardNo= CardNo;
    } 
    //setters and getters
    public String getCardNo() {
        return CardNo;
    }

    public void setCardNo(String CardNo) {

        this.CardNo =CardNo;
    }
    //withdraw function that takes away money from the account's balance
     public void withdraw(double amount){
         double i = getAmount();
         if (amount> 0.0) 
          setAmount(i-= amount);
               }

    @Override
    public String toString() {
        //creating a random number to store it in the cardNo. variable
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        //printing checking account information
        return super.toString()+ "\nCardNo=" + String.format("%06d", number) +"\n" ;
    }
}//end of class
