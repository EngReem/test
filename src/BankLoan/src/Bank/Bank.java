/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;


import java.util.ArrayList;


public class Bank {
    //attributes
    private String address;
    private String name;
    private static Bank Instance = null; //keeps track if an instance was created
    
    //private constructor so we don't allow for multiple object creation
    private Bank(String address, String name) {
        this.address = address;
        this.name = name;
    }


    private Bank() {
    }
    
    //this method creates an object of class Bank o returns an object if 
    //it was already created
    public static Bank getInstance() {
        
      if (Instance==null){
          Instance= new Bank ("Jeddah", "UJbank");
      }  
        
    return Instance;
        
    }
    public void getAccounts(ArrayList<Account> bankAccounts){
        for(Account account : bankAccounts){
            System.out.println(account); 
        }
    }//prints all accounts in the bank
    
}//end of class
