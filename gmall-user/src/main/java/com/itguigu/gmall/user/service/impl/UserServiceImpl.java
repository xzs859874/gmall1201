package com.itguigu.gmall.user.service.impl;
import com.itguigu.gmall.bean.UmsMember;
import com.itguigu.gmall.bean.UmsMemberReceiveAddress;
import com.itguigu.gmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itguigu.gmall.user.mapper.UserMapper;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMemberList = userMapper.selectAllUser();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Long memberId) {

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userMapper.selectReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }
}
