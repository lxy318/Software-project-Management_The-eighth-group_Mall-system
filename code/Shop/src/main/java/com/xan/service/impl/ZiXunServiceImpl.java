package com.xan.service.impl;

import com.xan.dao.CustomerMapper;
import com.xan.dao.ZiXunMapper;
import com.xan.pojo.Customer;
import com.xan.pojo.ZiXun;
import com.xan.pojo.ZiXunExample;
import com.xan.service.ZiXunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZiXunServiceImpl implements ZiXunService {

    @Autowired
    private ZiXunMapper ziXunMapper;
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<ZiXun> list() {
        ZiXunExample example = new ZiXunExample();
        example.createCriteria().andStatusEqualTo(1);
        List<ZiXun> ziXuns = ziXunMapper.selectByExample(example);
        for (ZiXun z:ziXuns){
            Customer customer =customerMapper.selectByPrimaryKey(z.getCstid());
            z.setCustomer(customer);
        }
        return ziXuns;
    }

    @Override
    public void save(ZiXun entity) {
        ziXunMapper.insert(entity);
    }

    @Override
    public void del(int id) {
        ziXunMapper.deleteByPrimaryKey(id);
    }

    @Override
    public ZiXun get(int id) {
        return ziXunMapper.selectByPrimaryKey(id);
    }

    @Override
    public void shenhe(int zid) {
        ziXunMapper.shenhe(zid);
    }

    @Override
    public List<ZiXun> list1() {
        List<ZiXun> ziXuns = ziXunMapper.selectByExample(null);
        for (ZiXun z:ziXuns){
            Customer customer =customerMapper.selectByPrimaryKey(z.getCstid());
            z.setCustomer(customer);
        }
        return ziXuns;
    }
}
