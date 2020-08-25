package za.co.abcbank.customer;
import za.co.abcbank.account.Account;
import za.co.abcbank.transaction.Transaction;
public class Customer{

public String firstName;
public String lastName;
public String gender;
public String dateOfBirth;
public void deposit(double amount){
System.out.println("Transaction successful. Current balance"+" "+"R"+ amount);
}
public void withdrawal(){
System.out.println("Transaction successsful. Current balance"+" "+"R"+ account.balance);
}

public void statement (double amount0, double amount1, String date0, String date1, String type0, String type1){
System.out.println("DATE"+"  "+"TYPE"+"  "+"AMOUNT");
System.out.println(date0+" "+type0+" "+"R"+amount0);
System.out.println(date1+" "+type1+" "+"R"+amount1);
}



public Account account;
}

