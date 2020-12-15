package com.wangjojo.mymall.service;

import com.wangjojo.mymall.common.api.CommonResult;
import org.springframework.stereotype.Component;

public interface  UmsMemberService {
    /*
    * 生成验证码
    * */
    CommonResult generateAuthCode(String telphone);

    /*
     * 判断验证码和手机号码是否匹配
     * */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
