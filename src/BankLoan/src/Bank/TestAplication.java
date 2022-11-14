package Bank;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TestAplication {
     public static void main(String[] args) {
         
         int count = 0;
         Customer newCus;
         Account newAcc;
         Loan l;
        
         ArrayList<Account> myAccounts = new ArrayList<>();//storing all bank accounts
         ArrayList<Customer> myCustomer = new ArrayList<>();//storing all bank customers
         ArrayList<Account> savingArr = new ArrayList<>();//storing all saving accounts
         ArrayList<Account> checkingArr = new ArrayList<>();///storing all checking accounts
         
       boolean quit = false;

            int menuItem;
            int Loanoption;
            String loan;
            //this do while loop runs a menu of choices that a user can choose from
            do {

                  System.out.print("\n Choose menu item: \n 1- Create Saveing Account \n 2- Create Checking Account "
                          + " \n 3- Loan \n 4- Print all customers "
                          + "\n 5- Print Saving Accounts lists \n 6- Print Checking Accounts lists "
                          + " \n 7- Print all accounts in the Bank"
                          + "\n - Press 0 to exit \n your choise : ");

                  Scanner in = new Scanner(System.in);
                  menuItem = in.nextInt();
                  
                   System.out.print("\n\n ");
                  
                  //each case depends on the number chosen by the user frm the menu
                  switch (menuItem) {
                  //creating a saving account case
                  case 1:


                                  newAcc = new SavingAccount("saving",null,0,0,null);
                                  //set object values
                                  newAcc.setName("");
                                  newAcc.setAmount(0);
                                  
                                  newCus = new Customer();
                                  //set object values
                                  newCus.setName(newAcc.getName());
                                  newCus.setID(newAcc.getID());
                                  newCus.setAddress(null);
                                  newCus.setPhone(0);

                                 //add the objects to the array
                                 myAccounts.add(newAcc);
                                 savingArr.add(newAcc);
                                 myCustomer.add(newCus);
                                 
 
                                 
                                 System.out.println("\n\n The saving account has been created \n\n ");

                        break;
                  //creating a checking account case
                  case 2:

                                 newAcc = new CheckingAccount("checking",null,0,0,null);
                                 //set object values
                                  newAcc.setName("");
                                  newAcc.setAmount(0);
                                  
                                 newCus = new Customer();
                                 //set object values
                                  newCus.setName(newAcc.getName());
                                  newCus.setID(newAcc.getID());
                                  newCus.setAddress(null);
                                  newCus.setPhone(0);
                                  
                                  

                                  //add the objects to the array
                                 myAccounts.add(newAcc);
                                 checkingArr.add(newAcc);
                                 myCustomer.add(newCus);
                                 
                                
                                 
                                 System.out.println("\n\n The checking account has been created \n ");

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
                        MortgageLoan Mortgage=new MortgageLoan();
                       
                        System.out.print("Enter your RealEstate Location:  ");
                        loan=in.next();  
                        Mortgage.setRealEstateLocation(loan);
                        
                        Mortgage.setAmount(0);
                        Mortgage.setLoanNum(0);
                        Mortgage.LoanCalcuater();
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
                         for (Customer customer : myCustomer)
                          System.out.println(customer);
      
                        break;
                      
                  case 5://displaying all saving accounts in the bank system 

                        //Print all objects in the ArrayList 
                         for (Account A : savingArr)
                          System.out.println(A);
                         
                        break;
                  
                 case 6://displaying all checking accounts in the bank system   

                        //Print all objects in the ArrayList
                         for (Account A : checkingArr)
                          System.out.println(A);
      
                        break;
                        
                       
                 case 7:  //displaying all accounts in the bank system 

                     System.out.println("\nThe existing bank accounts are:");
                     Bank bank = Bank.getInstance();
                     bank.getAccounts(myAccounts);
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
   
   


   

