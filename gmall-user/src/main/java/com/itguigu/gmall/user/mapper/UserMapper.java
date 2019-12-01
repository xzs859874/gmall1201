package com.itguigu.gmall.user.mapper;

import com.itguigu.gmall.bean.UmsMember;

import com.itguigu.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserMapper {

    List<UmsMember> selectAllUser();

    List<UmsMemberReceiveAddress> selectReceiveAddressByMemberId(Long memberId);
}