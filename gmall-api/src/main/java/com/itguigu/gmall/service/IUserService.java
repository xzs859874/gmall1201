package com.itguigu.gmall.service;

import com.itguigu.gmall.bean.UmsMember;
import com.itguigu.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface IUserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Long memberId);
}
