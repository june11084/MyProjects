public class WalletRunner
{
    public static void main(String[] args)
    {
        Wallet wallet1 = new Wallet(6,2,1,1);
        Wallet wallet2 = new Wallet(0,4,1,0);
        System.out.println("wallet1 = " + wallet1 + ", wallet2 = " + wallet2); 
        // wallet1.getMoney(30);
        // wallet2.addMoney(30);
        wallet1.transferMoney(wallet1, wallet2, 30);
        System.out.println("wallet1 = " + wallet1 + ", wallet2 = " + wallet2); 
    }
}
    
   