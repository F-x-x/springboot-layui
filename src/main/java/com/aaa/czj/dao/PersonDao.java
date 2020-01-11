package com.aaa.czj.dao;

import com.aaa.czj.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//mapper   意思是扫描的时候能找到
@Mapper
@Repository
public interface PersonDao {
// 查询
 List<Person> findAllPerson();
//添加
 void addUser(Person person);
 //删除
 void deleteById(int id);
}
