package com.gdaib.service.impl;

import com.gdaib.mapper.AccountMapper;
import com.gdaib.mapper.UsersMapper;
import com.gdaib.pojo.AccountExample;
import com.gdaib.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by znho on 2017/4/22.
 */
public class UsersServiceImpl implements UsersService {

    //属性注入
    @Autowired
    public AccountMapper accountMapper;

    @Autowired
    public AccountExample accountExample;


    public int findAccountFromUsername(String username) throws Exception {

        System.out.println(username+"!!!!");
            AccountExample.Criteria criteria= accountExample.createCriteria();
            criteria.andAccountEqualTo(username);
        System.out.println(criteria.toString() + "!!!!");


        return accountMapper.countByExample(accountExample);


    }




}
