package hw.hw5.task4.bank;

class Transaction {

  private final Account from;

  private final Account to;

  private final int amount;

  Transaction(Account from, Account to, int amount) {
    this.from = from;
    this.to = to;
    this.amount = amount;
  }

  Account getFrom() {
    return from;
  }

  Account getTo() {
    return to;
  }

  int getAmount() {
    return amount;
  }
}
