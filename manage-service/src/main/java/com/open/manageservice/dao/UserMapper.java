package com.open.manageservice.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.open.manageservice.entity.UserInfo;

import java.util.List;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public interface UserMapper extends BaseMapper<UserInfo>{
    /**
     * 自定义sql
     * @return
     */
    List<UserInfo> queryList();
}
