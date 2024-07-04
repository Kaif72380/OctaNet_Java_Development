import java.util.*;
class atm{
    float Balance;
    int PIN=000;
    void checkpin(){
        System.out.println("Enter your pin: ");
        Scanner sc= new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin==PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
        }
    }
    void menu(){
        System.out.println("Enter your choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");
    Scanner sc=new Scanner(System.in);
    int opt = sc.nextInt();
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
    else {
        System.out.println("Enter a valid choice");
    }
}


    void  checkBalance(){
        System.out.println("Balance: " + Balance);
        menu();
    }


    void withdrawMoney(){
        System.out.println("Enter amount to be withdrawn");
        Scanner sc=new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance=Balance-amount;
            System.out.println("Money withdrawn succesfully");
            System.out.println("Balance:" + Balance);
        }
        menu();
    }

    void depositMoney(){
        System.out.println("Enter the amount: ");
        Scanner sc=new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance= Balance + amount;
        System.out.println("Money deposited successfully");
        System.out.println("Balance:" + Balance);
        menu();

    }

    public static void main(String[] args) {
        atm obj=new atm();
        obj.checkpin();
    }
 }