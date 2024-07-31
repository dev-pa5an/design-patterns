import java.math.BigDecimal;

public interface IAccount {
    int getAccountNumber();
    void deposit(BigDecimal amount);
    void withdraw(BigDecimal amount);
    void transfer(IAccount toAccount, BigDecimal amount);
}
