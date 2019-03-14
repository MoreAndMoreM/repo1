package com.itheima.service.Impl;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    @Override
    public List<Account> findAll() {
        System.out.println ("业务层的查询所有用户....");
        return null;
    }

    @Override
    public void saveUser(Account account) {

    }
}
