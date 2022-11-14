/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;


import java.util.Scanner;

  //public class 
   public class Loan {
    //attributes
    private int loanNum;
    private double amount;
    private String type;
    Scanner sc=new Scanner(System.in); 
    //constructors


    //public abstract double getMonthlyPayment();
    //public abstract double getTotalInterestPercentage();
    public Loan(int loanNum, double amount, String type) {
        this.loanNum = loanNum;
        this.amount = amount;
        this.type = type;
    }

    public Loan() {
    }

    //setters and getters
    public int getLoanNum() {
        return loanNum;
    }

    public void setLoanNum(int loanNum) {
        int count = 1;
        this.loanNum = count;
        count++;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        
        System.out.print("set the loan amount :");
        this.amount = sc.nextInt();

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        
        this.type = type;
    }
    
    
     
    
    //LoanCalculater calculates the monthly amount for paying back any taken loans
    
    public void LoanCalcuater() {   
        System.out.println("for how many years ? min time 1y, max time 5yrs:");
        int period = sc.nextInt();
        double Rate = 0;//interest rate
         //checking the number of years chosen by the user
          if (period == 1){
            Rate = .05;
            }

            else if (period == 2)
            {
            Rate = .10;
            }

            else if (period == 3)
            {
            Rate = .15;
            }

            else if (period == 4)
            {
            Rate = .20;
            }

            else if (period == 5)
            {
            Rate = .25;
            }
          //if the number of years is not within specified range 
           else  {
            System.out.println("error , min time 1y , max time 5yrs");
            }

        //
        Rate=Rate/(12*100); 
        period=period*12; 
        //calculating the monthly payment
        double emi= (amount*Rate*Math.pow(1+Rate,period))/(Math.pow(1+Rate,period)-1);
        System.out.print(" \nYou will paid Monthly  = "+String.format("$%,.2f", emi)+"\n \n ");  

    }

   
    
    }
    //end of method

//end of class
