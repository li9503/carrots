package com.jnshu.carrots.backstageservice.exception;

/**
 * @Author 李景磊
 * @Description
 * @Date 2018/10/11 21:54
 * @ModifiedBy：
 */
public class Result<T> {

    //    error_code 状态值：0 为成功，其他数值代表失败
    private Integer code;

    //    error_message 错误信息，若status为0时，为success
    private String message;

    //    content 返回体报文的出参，使用泛型兼容不同的类型
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setStatus(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData(Object object) {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
