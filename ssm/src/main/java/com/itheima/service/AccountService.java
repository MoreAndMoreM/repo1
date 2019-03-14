package com.itheima.service;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;

import java.util.List;

/**
 * 业务层接口
 */
public interface AccountService {
    /**
     * 查询所有用户
     * @return
     */
    public List<Account> findAll();

    /**
     * 增加用户
     * @param account
     */
    public void saveUser(Account account);
}
