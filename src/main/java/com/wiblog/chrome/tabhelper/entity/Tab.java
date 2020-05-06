package com.wiblog.chrome.tabhelper.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 *
 * @author pwm
 * @date 2020-05-06
 */
@Data
public class Tab implements Serializable{

	private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;


    /**
     * 用户id
     */
    private Long uid;

    /**
     * 标签信息
     */
    private String tabs;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

}
