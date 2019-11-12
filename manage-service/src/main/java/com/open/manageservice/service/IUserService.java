package com.open.manageservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.open.manageservice.entity.UserInfo;

import java.util.List;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public interface IUserService extends IService<UserInfo>{
    /**
     * 保存用户信息
     * @param userInfo
     * @return
     */
    @Override
    boolean save(UserInfo userInfo);

    /**
     * 查询人员信息
     * @return
     */
    List<UserInfo> queryList();
}
