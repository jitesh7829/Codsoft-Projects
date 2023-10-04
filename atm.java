import java.util.HashMap;
import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        ATMop obj=new ATMop();

    }
}

class Data{
    float balance;
}


class ATMop{
    Scanner sc=new Scanner(System.in);
    HashMap<Integer,Data> map=new HashMap<>();
    ATMop(){
        System.out.println("********************************************");
        System.out.println("Welcome to Our ATM");
        op();
    }
    public void op(){
        System.out.println("Enter Your Pin Code");
        int pincode=sc.nextInt();

        if (map.containsKey(pincode)== true){
            Data obj=map.get(pincode);
            menu(obj);
        }
        else {
            System.out.println("********************************************");
            System.out.println("Please Create Account First");
            System.out.println("Set Your Pin Code");
            int pin=sc.nextInt();
            Data obj=new Data();
            map.put(pin,obj);
            menu(obj);
        }
    }

    public void menu(Data obj){
        System.out.println("********************************************");
        System.out.println("Please Enter Valid Number");
        System.out.println("1 . Check Balance");
        System.out.println("2 . Deposit Money");
        System.out.println("3 . Withdraw Money");
        System.out.println("4 . Check Another Balance");
        System.out.println("5 . Exit");

        int x=sc.nextInt();

        if (x==1)
        {
            check_balance(obj);
        }
        else if (x==2)
        {
            deposit(obj);
        }
        else if (x==3)
        {
            withdraw(obj);
        }
        else if (x==4)
        {
            op();
        }
        else if (x==5)
        {
            System.out.println("Thanking You !");
        }
        else {
            System.out.println("Please Enter a Valid Number");
            menu(obj);
        }
    }

    public void check_balance(Data obj){
        System.out.println("********************************************");
        System.out.println("Your Balance"+obj.balance);
        System.out.println("********************************************");
        menu(obj);
    }
    public void deposit(Data obj){

        System.out.println("Enter Your Amount");
        float a=sc.nextFloat();

        obj.balance=obj.balance+a;

        System.out.println("Amount Deposited Successfully");
        System.out.println("********************************************");
        menu(obj);
    }

    public void withdraw(Data obj){
        System.out.println("Enter Your Amount");
        float a=sc.nextFloat();
        if (obj.balance>=a){
            obj.balance=obj.balance-a;
            System.out.println("Amount Withdraw Successfully");
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
        System.out.println("********************************************");
        menu(obj);
    }



}