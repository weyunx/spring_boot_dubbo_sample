package com.bocsoft.rdm.sample.dao;

import com.bocsoft.rdm.sample.pojo.CityEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {
    @Select("SELECT city,state FROM CITY WHERE state = #{state}")
    CityEntity findByState(@Param("state") String state);

}
