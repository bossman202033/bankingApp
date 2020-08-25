package za.co.abcbank.test;
import za.co.abcbank.transaction.Transaction;
import za.co.abcbank.account.Account;
import za.co.abcbank.customer.Customer;
import za.co.abcbank.display.Display;
import java.util.Scanner;
public class Test{
public static void main(String[] args){

Display dis = new Display();
dis.display();
Customer cust = new Customer();
Account account = new Account();
account.balance = 0.0;
cust.account = account;
cust.account.transaction = new Transaction[10];
Transaction transA = new Transaction();
Transaction transB = new Transaction();
for(int c=0; c!=6; c++){
dis.display();
Scanner scan = new Scanner(System.in);
int input = scan.nextInt();

if(input == 1){
System.out.println("<<<< Open Account >>>>");
System.out.println("ENTER FIRSTNAME");
scan.nextLine();
cust.firstName = scan.nextLine();
System.out.println("ENTER LASTNAME");
cust.lastName = scan.nextLine();
System.out.println("ENTER DATE OF BIRTH");
cust.dateOfBirth = scan.nextLine();
System.out.println("ENTER GENDER");
cust.gender = scan.nextLine();
}
if(input == 2){
System.out.println("<<<< Deposit >>>>");
System.out.println("ENTER ACCOUNT NUMBER");
account.accountNumber = scan.nextLong();
scan.nextLine();

System.out.println("ENTER DATE");
transA.date = scan.nextLine();

System.out.println("ENTER AMOUNT");
transA.amount = scan.nextDouble();
cust.deposit(transA.amount);
transA.type = "Deposit";
cust.account.transaction[0] = transA;

}
if(input ==3){
System.out.println("<<<< Withdraw >>>>");
System.out.println("ENTER ACCOUNT NUMBER");
account. accountNumber = scan.nextLong();
scan.nextLine();

System.out.println("ENTER DATE");
transB.date = scan.nextLine();

System.out.println("ENTER AMOUNT");
transB.amount = scan.nextDouble();
transB.type = "Withdrawal";

cust.account.transaction[1] = transB;

account.balance = transA.amount - transB.amount;
cust.withdrawal();
}
if(input ==4){
System.out.println("<<<< Check Balance >>>>");
System.out.println("R"+ account.balance);
}
if(input == 5){
System.out.println("<<<< Statement >>>>");
cust.statement(transA.amount, transB.amount, transA.date, transB.date, transA.type, transB.type);
}

}
}
}
