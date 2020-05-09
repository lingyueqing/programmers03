package com.xdkj.servicebase.exceptionhandler;

import com.baomidou.mybatisplus.extension.api.R;
import com.xdkj.commonutils.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author fuqingqing
 * @date 2020-05-09 3:28
 */
/**
 * 统一异常处理类
 */
@ControllerAdvice
public class MyExceptionHandler {



        @ExceptionHandler(Exception.class)
        @ResponseBody
        public Result error(Exception e){
            e.printStackTrace();
            return Result.error();
        }

    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public Result error(ArithmeticException e){
        e.printStackTrace();
        return Result.error().message("执行了自定义异常");
    }
}
