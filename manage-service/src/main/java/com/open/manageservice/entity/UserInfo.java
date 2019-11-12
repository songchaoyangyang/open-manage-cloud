package com.open.manageservice.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
@Data
@TableName("user")
public class UserInfo {
    /**
     * 主键
     */
    private int id;
    /**
     * 名称
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
}
