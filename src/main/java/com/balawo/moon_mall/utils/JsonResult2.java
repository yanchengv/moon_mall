package com.balawo.moon_mall.utils;

//定义统一的 json 结构
//由于封装的 json 数据的类型不确定，所以在定义统一的 json 结构时，我们需要用到泛型。统一的 json 结构中属性包括数据、状态码、提示信息即可，构造方法可以根据实际业务需求做相应的添加即可，一般来说，应该有默认的返回结构，也应该有用户指定的返回结构
public class JsonResult2<T> {
    private T data;
    private Integer status;
    private String msg;

    /**
     * 若没有数据返回，默认状态码为0，提示信息为：操作成功！
     */
    public JsonResult2() {
        this.status = 200;
        this.msg = "操作成功";
    }

    /**
     * 若没有数据返回，可以人为指定状态码和提示信息
     *
     * @param code
     * @param msg
     */
    public JsonResult2(Integer code, String msg) {
        this.status = code;
        this.msg = msg;
    }

    /**
     * 有数据返回，状态码为0，人为指定提示信息
     *
     * @param data
     * @param msg
     */
    public JsonResult2(String msg, T data) {
        this.data = data;
        this.status = 200;
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 有数据返回，人为指定提示信息、状态码
     *
     * @param data
     * @param msg
     */
    public JsonResult2(Integer code, String msg, T data) {
        this.data = data;
        this.status = code;
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }





    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "data=" + data +
                ", status=" + status +
                ", msg='" + msg + '\'' +
                '}';
    }
}
