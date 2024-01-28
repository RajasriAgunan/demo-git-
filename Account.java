import java.util.Scanner;

public class Account {
   public String name_ofMember;
   private double avail_bal;
   public Account(){

   }
   public Account(String name_ofMember,double avail_bal){
this.name_ofMember=name_ofMember;
this.avail_bal=avail_bal;
   }
   public void DepositAmount(double dp_amount){
      if(dp_amount>0){
         avail_bal+=dp_amount;
System.out.println("Deposited Amount:"+dp_amount);
System.out.println("Available_Balance after deposit:"+avail_bal);
      }

   }
public void WithDrawAmount(double wd_amount){
if((wd_amount>0)&&(wd_amount<=avail_bal))
   {
      avail_bal-=wd_amount;
      System.out.println("Withdrawn_Amount:"+wd_amount);
      System.out.println("Available_Balance after withdrawn:"+avail_bal);
   }
}
public void DisplayBalance(){
      System.out.print("Member:"+name_ofMember);
      System.out.print("Current balance:"+avail_bal);
   }
public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String name_ofMember= scan.nextLine();
    double avail_balance=scan.nextDouble();
      Account myAccount=new Account(name_ofMember,avail_balance);
      double deposit_Amount= scan.nextDouble();
      myAccount.DepositAmount(deposit_Amount);
      double withdrawn_Amount=scan.nextDouble();
      myAccount.WithDrawAmount(withdrawn_Amount);
      myAccount.DisplayBalance();


}

}
