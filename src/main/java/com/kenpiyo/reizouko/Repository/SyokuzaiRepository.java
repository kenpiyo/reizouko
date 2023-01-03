package com.kenpiyo.reizouko.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.kenpiyo.reizouko.entity.Syokuzai;


@Repository
@Mapper
public interface SyokuzaiRepository {
    @Select("select * from syokuzai")
    List<Syokuzai> findContentsAll();
}

