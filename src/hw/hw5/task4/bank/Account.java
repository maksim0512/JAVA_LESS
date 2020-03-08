package hw.hw5.task4.bank;

import java.util.Objects;

class Account {

  private final String name;

  private int amount;

  Account(String name, int amount) {
    this.name = name;
    this.amount = amount;
  }

  String getName() {
    return name;
  }

  int getAmount() {
    return amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Account account = (Account) o;
    return Objects.equals(name, account.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  boolean hasEnaughMoney(int amount) {

    return this.amount - amount >= 0;
  }

  void modifyBalance(int delta) {

    this.amount += delta;
  }
}
