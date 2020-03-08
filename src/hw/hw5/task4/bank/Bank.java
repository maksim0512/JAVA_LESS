package hw.hw5.task4.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {

  private static final FileReaderHandler dataReader = new FileReaderHandler();
  private Map<String, Account> accounts = new HashMap<>();
  private List<Transaction> transactions = new ArrayList<>();

  public void readData() {

    accounts = dataReader.readAccountsData();
    transactions = dataReader.readTransactions();
  }

  public void printAccountsData() {

    accounts.values().forEach(
        a -> System.out.println(a.getName() + " : " + a.getAmount())
    );
  }

  public void doTransactions() {

    for (Transaction transaction : transactions) {
      try {
        this.doTransaction(transaction);
      } catch (NoSuchAccountException e) {
        System.err.println("There is no such account");
      } catch (NotEnaughMoneyException e) {
        System.err.println("There is no enaugh money");
      }
    }
  }

  private void doTransaction(Transaction t) {

    if (checkAccountIsNotPresent(t.getFrom()) || checkAccountIsNotPresent(t.getTo()))
      throw new NoSuchAccountException();

    Account accountFrom = accounts.get(t.getFrom().getName());
    Account accountTo = accounts.get(t.getTo().getName());

    if (!accountFrom.hasEnaughMoney(t.getAmount()))
      throw new NotEnaughMoneyException();

    doMoneyTransaction(accountFrom, accountTo, t.getAmount());
  }

  private boolean checkAccountIsNotPresent(Account account) {

    return !accounts.containsValue(account);
  }

  private void doMoneyTransaction(Account accountFrom, Account accountTo, int amount) {

    accountFrom.modifyBalance(-amount);
    accountTo.modifyBalance(amount);
  }
}
