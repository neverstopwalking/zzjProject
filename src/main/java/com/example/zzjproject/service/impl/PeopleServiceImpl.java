package com.example.zzjproject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.zzjproject.entity.People;
import com.example.zzjproject.service.PeopleService;
import com.example.zzjproject.mapper.PeopleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 13155
* @description 针对表【people】的数据库操作Service实现
* @createDate 2024-06-16 22:16:15
*/
@Service
public class PeopleServiceImpl extends ServiceImpl<PeopleMapper, People>
    implements PeopleService {

    @Resource
    private PeopleMapper peopleMapper;

    @Override
    public List<People> getByName(String name) {
        QueryWrapper<People> peopleQueryWrapper = new QueryWrapper<>();
        peopleQueryWrapper.like("name",name);
        List<People> peopleList = peopleMapper.selectList(peopleQueryWrapper);
        return peopleList;
    }
}




