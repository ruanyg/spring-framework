package com.ruanyg.learn.spring.transfer.service.impl;

import com.ruanyg.learn.spring.transfer.dao.AccountDao;
import com.ruanyg.learn.spring.transfer.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 应癫
 */
@Transactional
@Service("transferService")
public class TransferServiceImpl {
    @Autowired
    private AccountDao accountDao;

//    @Override
    public void transfer(String fromCardNo, String toCardNo, int money) throws Exception {

        Account from = accountDao.queryAccountByCardNo(fromCardNo);
        Account to = accountDao.queryAccountByCardNo(toCardNo);

        from.setMoney(from.getMoney() - money);
        to.setMoney(to.getMoney() + money);

        accountDao.updateAccountByCardNo(to);
		/*if (1 == 1) {
			throw new RuntimeException();
		}*/
        accountDao.updateAccountByCardNo(from);
    }
}
