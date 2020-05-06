package com.wiblog.chrome.tabhelper.service.impl;

import com.wiblog.chrome.tabhelper.entity.User;
import com.wiblog.chrome.tabhelper.mapper.UserMapper;
import com.wiblog.chrome.tabhelper.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 *
 * @author pwm
 * @since 2020-05-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
