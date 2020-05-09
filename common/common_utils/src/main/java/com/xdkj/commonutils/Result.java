package com.xdkj.commonutils;

import com.baomidou.mybatisplus.extension.api.R;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fuqingqing
 * @date 2020-05-08 23:49
 */
//统一返回结果的类
    @Data
public class Result {
    @ApiModelProperty(value = "是否成功")
    private Boolean success;

    @ApiModelProperty(value = "返回码")
    private Integer code;

    @ApiModelProperty(value = "返回消息")
    private String message;

    @ApiModelProperty(value = "返回数据")
    private Map<String, Object> data = new HashMap<String, Object>();

    //把构造方法私有

    private Result() {
    }
    //链式编程




    //成功地静态方法
    public static Result ok(){
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(ResutCode.SUCCESS);
        result.setMessage("成功！");
        return result;
    }

    //失败的静态方法
    public static Result error(){
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(ResutCode.ERROR);
        result.setMessage("失败！");
        return result;
    }

    public Result success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public Result message(String message){
        this.setMessage(message);
        return this;
    }

    public Result code(Integer code){
        this.setCode(code);
        return this;
    }

    public Result data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public Result data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}
