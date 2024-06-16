package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entity.People;
import com.service.PeopleService;
import com.mapper.PeopleMapper;
import org.springframework.stereotype.Service;

/**
* @author 13155
* @description 针对表【people】的数据库操作Service实现
* @createDate 2024-06-16 22:16:15
*/
@Service
public class PeopleServiceImpl extends ServiceImpl<PeopleMapper, People>
    implements PeopleService{

}




