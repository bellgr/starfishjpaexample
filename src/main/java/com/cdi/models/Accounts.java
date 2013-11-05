package com.cdi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by gregbell on 11/5/13.
 */

@Entity
@Table(name = "accounts")
public class Accounts {

    @Id
    @Column(name = "account_id")
    int accountId;

    @Column(name = "account_type_id")
    int accountTypeId;

    @Column(name = "person_id")
    int personId;

    @Column(name = "amount")
    double amount;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int account_id) {
        this.accountId = account_id;
    }

    public int getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(int accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "accountId=" + accountId +
                ", accountTypeId=" + accountTypeId +
                ", personId=" + personId +
                ", amount=" + amount +
                '}';
    }
}
