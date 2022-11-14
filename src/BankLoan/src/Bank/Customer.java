/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

import java.util.Scanner;

public class Customer {
//attributes
private String name;
private int phone;
private long ID ;
private String address;
Scanner sc=new Scanner(System.in); 


    public Customer() {
    }

    public Customer(String name, int phone, long ID, String address) {
        this.name = name;
        this.phone = phone;
        this.ID = ID;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
         System.out.print("enter your phone :");
          this.phone = sc.nextInt();
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getAddress() {
        
        
        return address;
    }

    public void setAddress(String address) {
         System.out.print("Enter your Address :");
        this.address  = sc.nextLine();

    }
@Override
        public String toString() {
        return "name= " + name + "\nphone= " + phone + "\naddress= " + address + "\nID="+ ID;
    }

}
