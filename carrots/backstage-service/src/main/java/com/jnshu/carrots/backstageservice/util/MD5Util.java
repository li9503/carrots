package com.jnshu.carrots.backstageservice.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * @Author 李景磊
 * @Description
 * @Date 2018/10/12 15:06
 * @ModifiedBy：
 */
public class MD5Util {
    /**
     * 普通MD5
     *
     * @param
     * @return
     * @author daniel
     * @time 2016-6-11 下午8:00:28
     */
    public static String MD5(String input) {
        MessageDigest md5;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            return "check jdk";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
        char[] charArray = input.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }


    /**
     * 加盐MD5
     *
     * @param password
     * @return
     * @author daniel
     * @time 2016-6-11 下午8:45:04
     */
    public static String generate(String password, String salt) {
        password = MD5(MD5(password) + salt);
        return password;
    }

    /**
     * 盐值
     */
    public static String salt() {
        String salt = UUID.randomUUID().toString().replaceAll("-", "");
        return salt;
    }

    /**
     * 校验加盐后是否和原文一致
     *
     * @param password
     * @param md5
     * @return
     * @author daniel
     * @time 2016-6-11 下午8:45:39h
     */
    public static boolean verify(String password, String salt, String md5) {
        return generate(password, salt).equals(md5);
    }
}
