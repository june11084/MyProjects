public class Wallet
{
    private int singles, fives, tens, twenties;
    
    public Wallet(int singles, int fives, int tens, int twenties)
    {
        this.singles = singles;
        this.fives = fives;
        this.tens = tens;
        this.twenties = twenties;
    }
    
    public int getSingles()
    {
        return singles;
    }
    
    public void setSingles(int singles)
    {
        this.singles = singles;
    }
    
    public int getFives()
    {
        return fives;
    }
    
    public void setFives(int fives)
    {
        this.fives = fives;
    }
    
    public int getTens()
    {
        return tens;
    }
    
    public void setTens(int tens)
    {
        this.tens = tens;
    }
    
    public int getTwenties()
    {
        return twenties;
    }
    
    public void setTwenties(int twenties)
    {
        this.twenties = twenties;
    }
    
    public int totalMoney()
    {
        return singles + fives * 5 + tens * 10 + twenties * 20;
    }
    
    // assuming you give the largest denomnation first
    public void getMoney(int amount)
    {
        if (amount <= totalMoney())
        {
                int remainder = totalMoney() - amount;
                twenties = remainder/20;
                tens = (remainder%20)/10;
                fives = ((remainder%20)%10)/5;
                singles = ((remainder%20)%10)%5;
        }
        else
            System.out.println("Error");
    }
    
    public void addMoney(int amount)
    {
        twenties = twenties + amount/20;
        tens = tens + (amount%20)/10;
        fives = fives + ((amount%20)%10)/5;
        singles = singles + ((amount%20)%10)%5;
    }
    
    public void transferMoney(Wallet from, Wallet to, int amount)
    {
        if (amount <= from.totalMoney())
        {
            from.getMoney(amount);
            to.addMoney(amount);
        }
        else
            System.out.println("Error");
    }
    
    public String toString()
    {
        return "$" + totalMoney();
    }
}
                