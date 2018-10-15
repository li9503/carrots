package com.jnshu.carrots.serviceuser.exception;

/**
 * Created by fangzhipeng on 2017/6/1.
 */
public class UserLoginException extends RuntimeException{

    public UserLoginException(String message) {
        super(message);
        System.out.println("+++++++++++++++++++++++++++++++++++");
    }

}
