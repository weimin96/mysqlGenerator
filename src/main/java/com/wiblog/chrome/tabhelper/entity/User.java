package com.wiblog.chrome.tabhelper.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 
 *
 * @author pwm
 * @date 2020-05-06
 */
@Data
public class User implements Serializable{

	private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;


    /**
     * 用户名
     */
    private String username;

    /**
     * 头像地址
     */
    private String avatarImg;

    /**
     * 小程序openid
     */
    private String openid;

    /**
     * 状态 0删除
     */
    private Boolean state;

    /**
     * 创建时间
     */
    private Date createTime;

}
