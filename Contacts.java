import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

class Contacts{
 private String first, last, phone, email, search;
 private static int choice;
 private static char d;
 private static ArrayList<Contacts> contacts = new ArrayList<Contacts>();
 private static Scanner input = new Scanner(System.in);

 Contacts(){//Default Constructor
  first = " ";
  last = " ";
  phone = " ";
  email = " ";
 }

 Contacts(String f, String l, String p, String e){ //Constructor
  first = f;
  last = l;
  phone = p;
  email = e;
 }

 public static void Display(){
   for(Contacts con : contacts){
   System.out.print("Frist name: " + con.first + ", Last name: " + con.last + " ");
   System.out.print("Phone number: " + con.phone + " ");
   System.out.print("Email address: " + con.email + "\n");
   System.out.println();
  }
 }

 public static Contacts Search(String s){
  Contacts con = new Contacts(); //Create a empty Contacts type object
  for(Contacts a : contacts){
    if(a.first.equals(s)) con = a;//Objects comparesion using object.equals() method
    else if(a.last.equals(s)) con = a;
    else if(a.phone.equals(s)) con = a;
    else if(a.email.equals(s)) con = a;
  }
  return con;
 }

 public static void Delete(ArrayList<Contacts> a, Contacts c){
  System.out.println("Are you sure want to delete it?(y/n)");
  d = input.next().charAt(0);
  if(d == 'y'){ //ArrayList need to use Iterator to delete elements in the ArrayList
  for(Iterator<Contacts> it = a.iterator(); it.hasNext();){ //Create condition for loop through the ArrayList
   Contacts con = it.next(); //Create Contacts type variable to assign to it.next() method
    if(con == c) it.remove();
   }
    System.out.println("Contact removed successfuelly.");
  }
  else System.out.println("Contact not found.");
  }

 public String toString(){
  return ("First name:" + first + ", Last name: " + last + ", Phone number: " + phone + "Email address: " + email + "\n");
 }
 
 public static void main(String [] args){
 //Scanner input = new Scanner(System.in);
 Contacts con = new Contacts();
  System.out.println("Welcome to contacts menu, please select following options:");
 do{
  System.out.println("1. Add a contact.");
  System.out.println("2. Display All contacts.");
  System.out.println("3. Display the search contact.");
  System.out.println("4. Delete a contact.");
  System.out.println("0. Quit contacts.");
  choice = input.nextInt();
  input.nextLine();//Enter
  System.out.println();

  switch(choice){
  case 1:
  System.out.println("Enter the first name:");
  con.first = input.nextLine();
  System.out.println("Enter the last name:");
  con.last = input.nextLine();
  System.out.println("Enter the phone number:");
  con.phone = input.nextLine();
  System.out.println("Enter the email address:");
  con.email = input.nextLine();
  System.out.println();
  contacts.add(new Contacts(con.first, con.last, con.phone, con.email));//ArrayList object adding Contacts type info
  break;
  

  case 2:
  Display();
  break;

  case 3:
  System.out.println("Enter the person infomation you want to search:");
  con.search = input.nextLine();
   
     System.out.println(Search(con.search));
     System.out.println();
  break;

  case 4:
  System.out.println("Enter the person information you want to search:");
  con.search = input.nextLine();
  System.out.println(Search(con.search));
  
  Delete(contacts, Search(con.search));
  break;
  }
  }while(choice != 0);
 }
}
