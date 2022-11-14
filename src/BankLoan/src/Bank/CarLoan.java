
package Bank;

import java.util.Scanner;

public class CarLoan extends Loan {
       
    private int carID;
    private String carForm;
    private String driverLicense;      
    Scanner sc=new Scanner(System.in); 

    public CarLoan() {
    }
    public CarLoan(int loanNum, double amount, String type) {
        super(loanNum, amount, type);
        
    }

    public CarLoan(int loanNum, double amount, String type, int carID, String carForm, String driverLicense) {
        super(loanNum, amount, type);
        this.carID = carID;
        this.carForm = carForm;
        this.driverLicense = driverLicense;
    }


    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        
       System.out.println("Enter your Car ID :");
       this.carID = sc.nextInt();
        //this.carID = carID;
    }

    public String getCarForm() {
        return carForm;
    }

    public void setCarForm(String carForm) {
        this.carForm = carForm;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
       this.driverLicense = driverLicense;
    }

    @Override
    public String toString() {
        return "CarLoan{" + "carID=" + carID + ", carForm=" + carForm + ", driverLicense=" + driverLicense + ", sc=" + sc + '}';
    }

    

    


}


  
    
   
    
        
        


        

