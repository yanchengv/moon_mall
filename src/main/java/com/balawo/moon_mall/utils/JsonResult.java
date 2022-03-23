package com.balawo.moon_mall.utils;

import java.util.HashMap;

public class JsonResult<T> {
    /**
     * 状态码
     */
    private long code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 数据封装
     */
    private T data;


    public JsonResult() {
    }

    public JsonResult(long code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 成功返回结果
     *
     *
     */

    public static <Map> JsonResult<Map> success() {
        HashMap map = new HashMap();
        return new JsonResult(200, "操作成功", map);
    }


    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */

    public static <T> JsonResult<T> success(T data) {
        return new JsonResult<T>(200, "操作成功", data);
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */

    public static <T> JsonResult<T> success(String msg, T data) {
        return new JsonResult<T>(200, msg, data);
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */

    public static <T> JsonResult<T> success(Long status, String msg, T data) {
        return new JsonResult<T>(status, msg, data);
    }


    /**
     * 失败返回结果
     *
     *
     */

    public static <Map> JsonResult<Map> failed(String msg) {
        HashMap map = new HashMap();
        return new JsonResult(500, msg, map);
    }



    /**
     * 失败返回结果
     *
     * @param data 获取的数据
     */

    public static <T> JsonResult<T> failed(T data) {
        return new JsonResult<T>(500, "操作失败", data);
    }

    /**
     * 失败返回结果
     *
     * @param data 获取的数据
     */

    public static <T> JsonResult<T> failed(String msg, T data) {
        return new JsonResult<T>(500, msg, data);
    }

    /**
     * 失败返回结果
     *
     * @param data 获取的数据
     */

    public static <T> JsonResult<T> failed(Long code, String msg, T data) {
        return new JsonResult<T>(code, msg, data);
    }


    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
