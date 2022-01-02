package com.mycompany.account;

import javax.persistence.*;

@SuppressWarnings("ALL")
@Entity
@Table(name = "users_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer AccountId;
    @Column(length = 45, nullable = false, name = "AccountName")
    private String AccountName;
    private String AccountPhone;
    private String AccountAddress;
    private String Account;
    private String AccountPassword;


    public Integer getAccountId() {
        return AccountId;
    }
    public void setAccountId(Integer account_id) {
        this.AccountId = AccountId;
    }

    public String getAccountName() {
        return AccountName;
    }
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }


    public String getAccountPhone(){return AccountPhone;}
    public void setAccountPhone(String AccountPhone){this.AccountPhone = AccountPhone;}

    public String getAccountAddress(){return AccountAddress;}
    public void  setAccountAddress(String AccountAddress){this.AccountAddress = AccountAddress;}

    public String getAccount(){return Account;}
    public void setAccount(String Account){this.Account = Account;}

    public String getAccountPassword(){return AccountPassword;}
    public void setAccountPassword(String AccountPassword){this.AccountPassword = AccountPassword;}
    //下面式幹嘛的
//    @Override
//    public String toAccountString() {
//        return "User{" +
//                "AccountId=" + getAccountId() +
//
//                ", AccountName='" + getAccountName() + '\'' +
//                ", AccountPhone='" + getAccountPhone() +'\'' +
//                ", AccountAddress='" + getAccountAddress() +'\'' +
//                ", Account='" + getAccount() + '\'' +
//                ", AccountPassword='" + getAccountPassword() + '\'' +
//                '}';
//    }

}
