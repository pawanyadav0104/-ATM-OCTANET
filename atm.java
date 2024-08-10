package atmstimulation;
import java.util.*;

 class atmmachine{
    float Balance;
    int  PIN=8359;

    public void checkpin(){
        System.out.println("Enter Your PIN: ");
        Scanner sc=new Scanner (System.in);
        int enteredpin=sc.nextInt();
        if(enteredpin==PIN){
            menu();
        }
        else{
            System.out.println("Enter the Correct PIN: ");
            int a =sc.nextInt();
            checkpin();
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Chechk Account Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.EXIT");
        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        if(opt==1){
            checkBalance();

        }
        else if(opt==2){
            withdrawMoney();
        }
        else if(opt==3){
            depositMoney();
        }
        else if(opt==4){
            return;
        }
        else{
            System.out.println("Enter a valid choice: ");
        }
    }


    public void checkBalance(){
        System.out.println("Balance: "+Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter the Amount to be withdraw: ");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficinet Balance");
        }
        else{
            Balance=Balance-amount;
            System.out.println("Money withdrawn successfully");
        }
          menu();

    }
    public void depositMoney(){
        System.out.println("enter the amount to be deposited");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("money deposited ");
        menu();
    }

}
public class atm {
    public static void main(String[] args) {
        atmmachine obj=new atmmachine();
        obj.checkpin();
    }
    
}
