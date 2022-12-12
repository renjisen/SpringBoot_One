package com.rjs.service.userService;

import java.awt.image.BufferedImage;

public interface CheckCodeServiceInf {

    /**
     * 产生随机字母数字混合验证码
     */
    public String generateRandomMixedCode();

    /**
     * 生成校验码图片产生随机字母数字混合验证码
     */
    public BufferedImage getImage(String checkCode);
}