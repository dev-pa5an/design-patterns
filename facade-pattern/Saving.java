import java.math.BigDecimal;

public class Saving implements IAccount{
    private int accountNumber;
    private BigDecimal balance;

    public Saving(BigDecimal initAmmount){
        this.balance = initAmmount;
    }
    @Override
    public void deposit(BigDecimal amount){

    }
    @Override
    public void withdraw(BigDecimal amount){

    }
    @Override
    public void transfer(IAccount toAccount, BigDecimal amount){

    }
    @Override
    public int getAccountNumber(){
        return accountNumber;
    }
}