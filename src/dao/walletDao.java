package dao;
import Pojo.Account;

import java.util.HashMap;
import java.util.Map;

public class walletDao {
    private Map<Integer, Account> accountMap;

    public walletDao() {
        this.accountMap = new HashMap<>();;
    }
    public Map<Integer, Account> getAccountMap() {
        return accountMap;
    }
    public void setAccountMap(Map<Integer, Account> accountMap) {
        this.accountMap = accountMap;
    }
}
