/*
p
* AUTHOR : Partha Chakraborty
*
* PROGRAM : Online_Reservation_System.java
*
* DATE CREATED : 28-05-2024
*
* Description :
 This Online Reservation System will include all the necessary fields which are required during online reservation system.
Modules
Login Form - To access this Online Reservation System, each user should have a valid login id and password. After providing the correct login id and password, users will able to access the main system.
Reservation System - Under reservation form users will have to fill the necessary details such as their basic details, train number, train name will automatically come in the box, class type, date of journey, from (place) to destination and after that, users will have to press insert button.
Cancellation Form - If passengers want to cancel their tickets then they have to provide their PNR number and after submitting it, this will display the entire information related to that particular PNR number, If users want to confirm their cancellation, in this case they have to press OK button.L

 */

 import java.util.Scanner;

 public class Online_Reservation_System {
 
     // Initializing user login & password
     static String username = "partha@123";
     static String password = "1230";
     // Initializing variables
     static int trainNumber;
     static char trainName;
     static char classType;
     static String from;
     static String to;
     static String dateOfJourney;
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         // Login interface
         System.out.println("-----------------------------------------");
         System.out.println("         ONLINE RESRVATION SYSTEM          ");
         System.out.println("-----------------------------------------");
         System.out.println("");
         System.out.print("             Username :");
         String inputUsername = sc.nextLine();
         System.out.print("             Password :");
         String inputPassword = sc.nextLine();
         System.out.println("");
 
         if (inputUsername.equals(username) && inputPassword.equals(password)) {
             System.out.println("----------------------------------------");
 
             System.out.println("          Login successfully...            ");
         } else {
             System.out.println("");
             System.out.println("        Invalid login Id / Password...        ");
             System.out.println("");
 
             return;
         }
 
         // Reservation process
         System.out.println("----------------------------------------");
         System.out.println("");
         System.out.println("Please fill the details for your train reservation ! ");
         System.out.println("");
         System.out.println("Choose The Train Number From Below To Get The Right Details Of Your Reservation >> ");
         System.out.println("Please Choose among these Train Numbers ( 12703 | 22440 | 12277 | 12305 | 16352 )");
         System.out.print("Train number: ");
         trainNumber = sc.nextInt();
 
 //Checking details of Train name from Train number
         switch (trainNumber){
         case 12703:
         System.out.println("Your Train Name Is: FULAKNAMA EXP.");
                 break;
         case 22440:
         System.out.println("Your Train Name Is: VANDE BHARAT EXP.");
                 break;
         case 12277:
         System.out.println("Your Train Name Is: SATABDI EXP.");
                 break;
         case 12305:
         System.out.println("Your Train Name Is: RAJDHANI EXP.");
         break;
         case 16352:
         System.out.println("Your Train Name Is: NCJ MUMBAI EXP.");
         break;
         }
 
         System.out.println("");
         System.out.print("Class type: ");
         classType = sc.next().charAt(0);
 //        classType = sc.next().charAt(1);
 
         System.out.println("");
         System.out.print("From: ");
         from = sc.next();
         System.out.println("");
         System.out.print("To: ");
         to = sc.next();
         System.out.println("");
         System.out.print("Date of your journey: ");
         dateOfJourney = sc.next();
         System.out.println("");
 
         // Print the ticket
         System.out.println("----------------------------------------");
         System.out.println("            TICKET DETAILS                ");
         System.out.println("----------------------------------------");
         System.out.println("");
         System.out.println("Train Number: " + trainNumber);
 //        System.out.println("Train Name: " + trainName);
         System.out.println("Class Type: " + classType);
         System.out.println("From: " + from);
         System.out.println("To: " + to);
         System.out.println("Date of Journey: " + dateOfJourney);
         System.out.println("");
         System.out.println("----------------------------------------");
         System.out.println("");
 
         // Cancellation form
         System.out.println("Enter PNR number to book a reservation: ");
         String pnrNumber = sc.next();
         System.out.println("");
         System.out.println("Do you want to book this ticket [ OK / Cancel ] ");
         String confirmation = sc.next();
         if (confirmation.equalsIgnoreCase("OK")) {
             System.out.println("");
             System.out.println("Reservation booked successfully , Thanks For Visiting Us! Happy Journey! ");
         } else {
             System.out.println("Reservation canceled , Thanks For Visiting Us !");
         }
 
         sc.close();
     }
 }