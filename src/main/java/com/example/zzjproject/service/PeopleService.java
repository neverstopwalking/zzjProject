package com.example.zzjproject.service;

import com.example.zzjproject.entity.People;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 13155
* @description 针对表【people】的数据库操作Service
* @createDate 2024-06-16 22:16:15
*/
@Service
public interface PeopleService extends IService<People> {

    /**
     * 根据名称获取人物信息
     * @param name
     * @return
     */
    List<People> getByName(String name);

}
