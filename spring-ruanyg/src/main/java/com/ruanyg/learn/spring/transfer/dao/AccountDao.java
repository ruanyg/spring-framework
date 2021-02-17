package com.ruanyg.learn.spring.transfer.dao;

import com.ruanyg.learn.spring.transfer.pojo.Account;

/**
 * @author 应癫
 */
public interface AccountDao {

    Account queryAccountByCardNo(String cardNo) throws Exception;

    int updateAccountByCardNo(Account account) throws Exception;
}
