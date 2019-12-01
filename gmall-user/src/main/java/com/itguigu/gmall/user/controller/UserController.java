package com.itguigu.gmall.user.controller;

import com.itguigu.gmall.bean.UmsMember;
import com.itguigu.gmall.bean.UmsMemberReceiveAddress;
import com.itguigu.gmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    IUserService userService;

    /*@RequestMapping(value = "getReceiveAddressByMemberId",method = RequestMethod.GET)*/
    @GetMapping("/getReceiveAddressByMemberId")
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Long memberId) {

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }

    @RequestMapping("getAllUser")
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }


}