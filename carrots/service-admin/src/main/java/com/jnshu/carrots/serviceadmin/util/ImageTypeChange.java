package com.jnshu.carrots.serviceadmin.util;

import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/**
 * @author ljl
 */
public class ImageTypeChange {
//    static BASE64Encoder encoder = new sun.misc.BASE64Encoder();
//    static BASE64Decoder decoder = new sun.misc.BASE64Decoder();
//    static String getImageBinary(String fileName) {
//        File f = new File(fileName);
//        BufferedImage bi;
//        try {
//            bi = ImageIO.read(f);
//            String fileType = getFileType(fileName);
//            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//            ImageIO.write(bi, fileType, outputStream);
//            byte[] bytes = outputStream.toByteArray();
//
//            return encoder.encodeBuffer(bytes).trim();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    static String getFileType(String fileName) {
//        return fileName.substring(fileName.indexOf(".") + 1, fileName.length());
//    }

    /**
     * 将其他格式的图片转换成CDR或其它文件格式
     *
     * @param
     * @param newFileName
     */
  public  static void base64StringToImage(String newFileName,MultipartFile file) {
        try {
            byte[] bytes1 = file.getBytes();
            ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes1);
            BufferedImage bi1 = ImageIO.read(inputStream);
            //可以是jpg,png,gif格式
            File w2 = new File(newFileName);
            //不管输出什么格式图片，此处不需改动
            ImageIO.write(bi1, "png", w2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}