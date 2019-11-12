package com.open.manageservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.open.manageservice.dao.UserMapper;
import com.open.manageservice.entity.UserInfo;
import com.open.manageservice.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,UserInfo> implements IUserService{
    /**
     * 保存人员信息
     * @param entity
     * @return
     */
    @Override
    public boolean save(UserInfo entity) {
        return super.save(entity);
    }

    /**
     * 查询人员信息
     * @return
     */
    @Override
    public List<UserInfo> queryList() {
        return this.baseMapper.queryList();
    }
}
