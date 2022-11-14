
package bank;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class TestAplication {
     public static void main(String[] args) {

         Random rand = new Random();
         int count = 0;
         Customer newCus;
         Account newAcc;
         ArrayList<Account> myAccounts = new ArrayList<>();//storing all bank accounts
         ArrayList<Customer> myCustomer = new ArrayList<>();//storing all bank customers
         ArrayList<Account> savingArr = new ArrayList<>();//storing all saving accounts
         ArrayList<Account> checkingArr = new ArrayList<>();///storing all checking accounts
         
       boolean quit = false;

            int menuItem = 0;
            //this do while loop runs a menu of choices that a user can choose from
            do {
                  Scanner in = new Scanner(System.in);
                  boolean flag = true;
                  do
                  {
                      try
                      {
                          System.out.print("\n Choose menu item: \n 1- Create saving account \n 2- Create checking account "
                                  + " \n 3- Calculate Loan \n 4- Print all customers "
                                  + "\n 5- Print Saving Accounts lists \n 6- Print Checking Accounts lists "
                                  + " \n 7- Print all accounts in the Bank"
                                  + "\n  - Press (0) to exit \n Enter your choice : ");
                          menuItem = in.nextInt();
                          if ((Validations.validateMenuEnteredValue(menuItem))){
                              flag = false;
                          }
                      }catch (Exception e){
                          System.out.println(" \n ****************************");
                          System.out.println("   Wrong Entry! Try again");
                          System.out.println(" ****************************");
                          in.next();
                          continue;
                      }
                  }while(flag);

                  
                   System.out.print("\n");
                  
                  //each case depends on the number chosen by the user frm the menu
                  switch (menuItem) {
                  //creating a saving account case
                  case 1:

                                  int ser =  ((rand.nextInt(200)+100000));
                                  newAcc = new SavingAccount("Saving",null,0,0, ser+"");
                                  //set object values
                                  newAcc.setName("");
                                  newAcc.setAmount(0);
                                  
                                  newCus = new Customer();
                                  //set object values
                                  newCus.setName(newAcc.getName());
                                  newCus.setID(newAcc.getID());
                                  newCus.setAddress(null);
                                  newCus.setPhone("");

                                 //add the objects to the array
                                 myAccounts.add(newAcc);
                                 savingArr.add(newAcc);
                                 myCustomer.add(newCus);
                                 
 
                                 
                                 System.out.println("\n\n ****The Saving Account Has Been Created**** \n ");

                        break;
                  //creating a checking account case
                  case 2:

                                  newAcc = new CheckingAccount("Checking",null,0,0,null);
                                  //set object values
                                  newAcc.setName("");
                                  newAcc.setAmount(0);
                                  
                                  newCus = new Customer();
                                  //set object values
                                  newCus.setName(newAcc.getName());
                                  newCus.setID(newAcc.getID());
                                  newCus.setAddress(null);
                                  newCus.setPhone("");
                                  
                                  
                                 //add the objects to the array
                                 myAccounts.add(newAcc);
                                 checkingArr.add(newAcc);
                                 myCustomer.add(newCus);
                                 
                                
                                 
                                 System.out.println("\n\n ****The Checking Account Has Been Created**** ");

                        break;
                  
                 case 3: //calculating monthly loan payment
                       System.out.println("\n");
                       System.out.println(" Which loan you want?");
                       System.out.println("1. Mortgage loan");
                       System.out.println("2. Car loan");
                       System.out.println("3. exit");
                       Loanoption=in.nextInt();                              
                       switch(Loanoption)
                        {
                        case 1:
                        CarLoan car =new CarLoan(); 
   
                        break;
                        
                        case 2:

                        CarLoan car =new CarLoan(); 
                        car.setCarID(0);
                        //System.out.println("Enter your car Form",car.setCarForm(carForm)car.setCarForm(null);
                        System.out.print("Enter your Car Form: ");
                        loan=in.next();  
                        car.setCarForm(loan);
                        System.out.print("Enter your driver License: ");
                        loan=in.next(); 
                        car.setDriverLicense(loan);
                        

                        car.setAmount(0);
                        car.setLoanNum(0);
                        car.LoanCalcuater();
                        break;
                       
                        case 3:
                        break;
                        
                        default:
                        System.out.println("OOps! something went wrong!");
                        break;
                        }
    
                          

                        break;
                 
                 
                  case 4://displaying all customers in the system

                       //Print all objects in the ArrayList
                         System.out.println(" \n ----------------------------------------\n");
                         for (Customer customer : myCustomer)
                            System.out.println(customer);
                         System.out.println(" ----------------------------------------");
      
                        break;
                      
                  case 5://displaying all saving accounts in the bank system 

                        //Print all objects in the ArrayList
                         System.out.println(" \n ----------------------------------------\n");
                         for (Account A : savingArr)
                            System.out.println(A);
                         System.out.println(" ----------------------------------------");
                         
                        break;
                  
                 case 6://displaying all checking accounts in the bank system   

                        //Print all objects in the ArrayList
                         System.out.println(" \n ----------------------------------------\n");
                         for (Account A : checkingArr)
                            System.out.println(A);
                         System.out.println(" ----------------------------------------");
      
                        break;
                        
                       
                 case 7:  //displaying all accounts in the bank system 

                     System.out.println(" \n ----------------------------------------\n");
                     System.out.println("The Existing Bank Accounts Are:");
                     Bank bank = Bank.getInstance();
                     bank.getAccounts(myAccounts);
                     System.out.println(" ----------------------------------------");
                     break;  
      
                 //loop termination case    
                 case 0:
                     quit = true;
                     break;

                 default:

                        System.out.println("Invalid choice.");

                  }//end of switch

            } while (!quit);
    
     }//end of main
     
     
}//end of class
   
   


   

