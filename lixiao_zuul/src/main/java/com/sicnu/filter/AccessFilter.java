package com.sicnu.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.sicnu.utils.TextUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 权限验证过滤器
 */
@Component
@Slf4j
public class AccessFilter extends ZuulFilter {

   // private static final Logger logger= LoggerFactory.getLogger(AccessFilter.class);

    //过滤器类型 pre表示在请求之前进行拦截
    public String filterType() {
        return "pre";
    }


    //过滤器执行顺序,当请求在一个阶段的时候存在多个过滤器时,需要根据该方法的返回值依次执行
    public int filterOrder() {
        return 1;
    }

   //判断过滤器是否生效
    public boolean shouldFilter() {
        return true;
    }

   //
    public Object run() throws ZuulException {
        //获取请求上下文
        RequestContext rc = RequestContext.getCurrentContext();
        HttpServletRequest request =  rc.getRequest();
        //获取表单token
        String token = request.getParameter("token");
        //如果token为空
        if (TextUtils.isEmpty(token)){
           // 提示token为空
            log.info("token为空...");
            //请求结束,不在继续向下请求
            rc.setSendZuulResponse(false);
            //响应代码，HTTP401错误代码代表用户没有访问权限
            //这里应该从封装类中ResponseStatus中获取,但是目前没设置
            rc.setResponseStatusCode(401);
            //响应类型
            rc.getResponse().setContentType("application/json;charset=utf-8");
            PrintWriter writer = null;
            try{
                writer = rc.getResponse().getWriter();
                //响应内容
                writer.print("{\"message\":\""+401+"无访问权限"+"\"}");
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if (null != writer)
                    writer.close();
            }
        }else {
            log.info("token is ok..");
            //使用token进行身份验证
            //正常执行业务逻辑判断
        }
        return null;
    }

}
