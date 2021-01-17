package com.sicnu.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * 异常过滤器
 */
@Component
@Slf4j
public class ErrorFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "error";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext rc = RequestContext.getCurrentContext();
        Throwable throwable = rc.getThrowable();
        log.info("Error..."+throwable.getCause().getMessage(),throwable);
        //响应状态码 Http500 服务器错误 -- 代码逻辑出错
        rc.setResponseStatusCode(500);
        //响应类型
        rc.getResponse().setContentType("application/json;charset=utf-8");
        PrintWriter writer = null;
        try {
            writer = rc.getResponse().getWriter();
            //响应内容
            writer.print("{\"message\":\""+500+"服务器出错"+"\"}");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (null != writer){
                writer.close();
            }
        }

        return null;
    }
}
