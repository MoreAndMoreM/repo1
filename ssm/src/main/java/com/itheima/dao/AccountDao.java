package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 用户持久层接口
 */
public interface AccountDao {
    /**
     * 查询所有用户信息
     * @return
     */
    @Select (value = "select * from account")
    public List<Account> findAll();

    /**
     * 保存用户
     */
    public void saveUser(Account account);
}
