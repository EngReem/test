/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;


public class SavingAccount extends Account {
    
    private  String SerialNo;


    public String getSerialNo() {
        return SerialNo;
    }

    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    public SavingAccount(String accountType, String name, double amount, long ID) {
        super(accountType, name, amount, ID);
    }
    
     public SavingAccount(String accountType, String name, double amount, long ID,String SerialNo) {
        super(accountType, name, amount, ID);
        this.SerialNo=SerialNo;
    }

    @Override
    public String toString() {
         int count=0;
         String str=(super.toString() + "\nSerialNo=" + count +"\n");
         count++;
         
        return str;
        
    }
     
     
    


}

