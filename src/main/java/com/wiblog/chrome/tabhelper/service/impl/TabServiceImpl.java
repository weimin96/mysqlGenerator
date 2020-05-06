package com.wiblog.chrome.tabhelper.service.impl;

import com.wiblog.chrome.tabhelper.entity.Tab;
import com.wiblog.chrome.tabhelper.mapper.TabMapper;
import com.wiblog.chrome.tabhelper.service.ITabService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 *
 * @author pwm
 * @since 2020-05-06
 */
@Service
public class TabServiceImpl extends ServiceImpl<TabMapper, Tab> implements ITabService {

}
