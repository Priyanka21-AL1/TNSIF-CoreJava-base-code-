package Day13Project;

public interface Bank {
      static final int MINBAL = 5000;
      static final int DAILT_LIMIT=25000;
      void deposite(int amt) throws DepositeLimitException;
      void withdraw(int amt) throws InsuficientBalanceException;
}
