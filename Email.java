package emailapp;

import java.util.Scanner;

public class Email {
   private  String firstName;
   private  String lastName;
   private  String password;
   private  String department;
   private  String email;
   private  int mailboxCapacity = 500 ;
   private  int defaultPasswordLength = 10;
   private  String alternateEmail;
   private  String companySuffix ="darkaicompany.com";
   //Constructor to recieve the first name and last name 
   public Email(String firstName , String lastName){
       this.firstName = firstName;
       this.lastName = lastName;
       
      
       
       //Call a method asking for the department - return the department
       this.department = setDepartment();
       
       //Call a method that returns a random password
       this.password = randomPassword(defaultPasswordLength);
       System.out.println("Your password is:" + this.password);
       
       // Combine elements to genterate email
       email = firstName.toLowerCase()  + lastName.toLowerCase()+"@" + department + "." + companySuffix;
      System.out.println("Your email is :" +email);
   } 
   //Ask for the department
   private String setDepartment(){
       System.out.print( "New worker "+ firstName +"\nDEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter departement code: ");
       Scanner in = new Scanner(System.in);
      
       int deepChoice = in.nextInt();
       
       if(deepChoice == 1){return "sales";}
   
       else if (deepChoice == 2){return "dev";}
       else if(deepChoice == 3) {return "acct";}
       else{ return "";}
       
   }
   //Generate a random password
     private String randomPassword(int length){
         String passwordSet ="ABCDEFGHIGKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
         char[] password = new char[length];
         for(int i = 0 ; i<length;i++){
         int rand =(int)(Math.random()*passwordSet.length());
         password[i] = passwordSet.charAt(rand);
         
     }
         return new String(password);
     }
   //Set the mailbox capaity 
     public void mailboxCapacity(int capacity){
         this. mailboxCapacity = capacity ;
         
     }
     // Set an alternaive email
     public void setAlternateEmail(String altEmail){
         this.alternateEmail = altEmail;
     }
         
     //Change the password 
     public void chamgePassword(String Password){
         this.password = password;
         
     }
   public int getMailboxCapacity() {return mailboxCapacity ;}
   public String getAlternateEmail(){return alternateEmail;}
   public String getPassword(){return password;}
   public String  showInfo(){
       return "DISPLAY NAME: " +firstName+"" +lastName+ 
               "\nCOMPANY EMAIL:" + email +
               "\nMAILBOX CAPACITY:" +mailboxCapacity+"mb" ;}
}
