package com.rjs.service.userService;

import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;
@Service
public class CheckCodeServiceImpl implements CheckCodeServiceInf {
    // 校验码图片宽
    private int width = 85;
    // 校验码图片高
    private int height = 20;
    // 校验码长度
    private int codeLength = 4;
    // 混合字母数字数组
    private String[] charArray = new String[]{"0","1","2","3","4","5","6","7","8","9",
            "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R",
            "S","T","U","V","W","X","W","Z"};
    @Override
    public String generateRandomMixedCode() {
        String sRand = "";
        Random random = new Random();
        //codeLength   4
        for (int i = 0; i < codeLength; i++) {
            // private String[] charArray = new String[]{"0","1","2","3","4","5","6","7","8","9",
            //            "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R",
            //            "S","T","U","V","W","X","W","Z"};
            sRand += charArray[random.nextInt(charArray.length)];  //charArray[10]    1-10
        }
        return sRand;
    }

    @Override
    public BufferedImage getImage(String checkCode) {
        // 在内存中创建图象
        BufferedImage image = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);
        // 获取图形上下文
        Graphics g = image.getGraphics();
        // 设定背景色
        g.setColor(getRandColor(200, 250));
        g.fillRect(0, 0, width, height);
        // 设定字体
        g.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        // 生成随机类
        Random random = new Random();
        // 随机产生155条干扰线，使图象中的认证码不易被其它程序探测到
        g.setColor(getRandColor(160, 200));
        for (int i = 0; i < 155; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            int xl = random.nextInt(12);
            int yl = random.nextInt(12);
            g.drawLine(x, y, x + xl, y + yl);
        }
        for (int i = 0; i < checkCode.length(); i++) {
            // 将认证码显示到图象中
            g.setColor(new Color(20 + random.nextInt(110), 20 + random
                    .nextInt(110), 20 + random.nextInt(110)));
            // 调用函数出来的颜色相同，可能是因为种子太接近，所以只能直接生成
            g.drawString(String.valueOf(checkCode.charAt(i)), 13 * i + 6, 16);
        }
        // 图象生效
        g.dispose();
        return image;
    }
    private Color getRandColor(int fc, int bc) {
        Random random = new Random();
        if (fc > 255)
            fc = 255;
        if (bc > 255)
            bc = 255;
        int r = fc + random.nextInt(bc - fc);
        int g = fc + random.nextInt(bc - fc);
        int b = fc + random.nextInt(bc - fc);
        return new Color(r, g, b);
    }
}
