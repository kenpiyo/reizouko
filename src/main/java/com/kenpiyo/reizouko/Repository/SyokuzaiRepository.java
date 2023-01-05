package com.kenpiyo.reizouko.Repository;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.kenpiyo.reizouko.entity.Syokuzai;


@Repository
@Mapper
public interface SyokuzaiRepository {
    @Select("select * from syokuzai")
    List<Syokuzai> findContentsAll();

    @Insert("insert into syokuzai (syokuzaiName, amount, expDate) values (#{syokuzainame}, #{amount}, #{expDate})")
    void insert(@Param("syokuzainame")String syokuzaiName, @Param("amount")int amount, @Param("expDate")Date expDate);
}



