package com.bocsoft.rdm.sample.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bocsoft.rdm.sample.api.GreetService;
import com.bocsoft.rdm.sample.dao.CityMapper;
import com.bocsoft.rdm.sample.pojo.CityEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Slf4j
@Transactional
@Service(version = "1.0.2")
public class GreetServiceImpl implements GreetService {
    @Autowired
    CityMapper cityMapper;
    @Override
    public String sayHi(String name) {
        CityEntity city = cityMapper.findByState(name);
        String a = new String("aa"+"bb"+"cc");
        String b = "aabbcc";
        //return "Hi "+ name + "!"+city.getCity()+city.getState();
        return "2、"+(a==b?"true":"false");
    }

}
