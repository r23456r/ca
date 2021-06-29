package com.bc.response;

import com.bc.constant.CommonConstant;
import lombok.Data;

/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2019-12-02 下午3:58
 */
@Data
public class Result<T> {
    private Integer code = CommonConstant.SUCCESS;
    private String msg = "success";
    private T data;
    private Long total;

    private Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result() {
    }

    private Result(T data) {
        this.data = data;
    }

    private Result(T data, Long total){
        this.data = data;
        this.total = total;
    }

    public static Result ok() {
        return new Result();
    }

    public static <T> Result<T> ok(T data) {
        return new Result<>(data);
    }

    public static <T> Result<T> ok(T data, Long total) {
        return new Result<>(data, total);
    }

    public static <T> Result<T> error(Integer code, String msg) {
        return new Result<>(code, msg);
    }

}
