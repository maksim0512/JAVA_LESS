package hw.hw5.task4;

import hw.hw5.task4.bank.Bank;

public class Main {

  public static void main(String[] args) {

    Bank bank = new Bank();

    bank.readData();

    bank.printAccountsData();

    bank.doTransactions();

    bank.printAccountsData();
  }
}
