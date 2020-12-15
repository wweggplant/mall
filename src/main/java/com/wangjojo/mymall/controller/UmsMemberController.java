package com.wangjojo.mymall.controller;

import com.wangjojo.mymall.common.api.CommonResult;
import com.wangjojo.mymall.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(tags = "UmsMemberController", description = "会员登录注册管理")
@RequestMapping("/sso")
@Controller
public class UmsMemberController {
    @Autowired
    private UmsMemberService memberService;

    @ApiOperation("获取验证码")
    @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
    @ResponseBody
    CommonResult genrateAuthCode(String telphone) {
        return memberService.generateAuthCode(telphone);
    }

    @ApiOperation("判断验证码是否正确")
    @RequestMapping(value = "/verifyAuthCode", method = RequestMethod.POST)
    @ResponseBody
    CommonResult verifyAuthCode(String telephone, String authCode) {
        return memberService.verifyAuthCode(telephone,authCode);
    }

}
