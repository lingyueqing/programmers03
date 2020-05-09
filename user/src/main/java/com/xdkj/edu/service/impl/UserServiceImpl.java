package com.xdkj.edu.service.impl;

import com.xdkj.edu.pojo.User;
import com.xdkj.edu.mapper.UserMapper;
import com.xdkj.edu.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fuqingqing
 * @since 2020-05-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
