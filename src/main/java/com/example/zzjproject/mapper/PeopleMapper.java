package com.example.zzjproject.mapper;

import com.example.zzjproject.entity.People;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 13155
* @description 针对表【people】的数据库操作Mapper
* @createDate 2024-06-16 22:16:15
* @Entity com.entity.People
*/
@Mapper
public interface PeopleMapper extends BaseMapper<People> {

}




