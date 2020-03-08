package hw.hw5.task4.bank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FileReaderHandler {

  private static final String BALANCE_FILE_PATH = "balance.dt";
  private static final String TRANSACTIONS_FILE_PATH = "transactions.dt";

  Map<String, Account> readAccountsData() {

    Map<String, Account> resultList = new HashMap<>();

    try (BufferedReader rdr = new BufferedReader(new FileReader(BALANCE_FILE_PATH))) {

      String[] split;

      while (rdr.ready()) {

        split = rdr.readLine().split(" ");

        resultList.put(split[0], new Account(split[0], Integer.parseInt(split[1])));
      }

    } catch (IOException e) {
      e.printStackTrace();
    }

    return resultList;
  }

  List<Transaction> readTransactions() {

    List<Transaction> resultList = new ArrayList<>();

    try (BufferedReader rdr = new BufferedReader(new FileReader(TRANSACTIONS_FILE_PATH))) {

      String[] split;

      while (rdr.ready()) {

        split = rdr.readLine().split(" ");

        resultList.add(new Transaction(
            new Account(split[0], 0),
            new Account(split[1], 0),
            Integer.parseInt(split[2])
        ));
      }

    } catch (IOException e) {
      e.printStackTrace();
    }

    return resultList;
  }
}
