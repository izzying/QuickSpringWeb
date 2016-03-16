package com.beeant.common.sitemesh;

import org.sitemesh.DecoratorSelector;
import org.sitemesh.content.Content;
import org.sitemesh.webapp.WebAppContext;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by Beeant on 2016/3/3.
 */
public class ParamDecoratorSelector implements DecoratorSelector<WebAppContext> {

    private DecoratorSelector<WebAppContext> defaultDecoratorSelector;

    public ParamDecoratorSelector(DecoratorSelector<WebAppContext> defaultDecoratorSelector) {
        this.defaultDecoratorSelector = defaultDecoratorSelector;
    }

    @Override
    public String[] selectDecoratorPaths(Content content, WebAppContext webAppContext) throws IOException {
        // build decorator based on the request
        HttpServletRequest request = webAppContext.getRequest();
        String onlybody = request.getParameter("onlybody");
        if (!StringUtils.isEmpty(onlybody) && onlybody.equals("yes")) {
            //按照参数值返回对应路径下面的jsp装饰模板页码
            return new String[] { "/sitemesh/content.jsp" };
        } else if (request.getServletPath().equals("/app/index")){
            return new String[] { "/sitemesh/decorator.jsp", "/sitemesh/menu-left.jsp","/sitemesh/menu-top.jsp"};
        } else if(request.getServletPath().equals("/app/login")){
            return new String[] {};
        }

        return new String[] { "/sitemesh/decorator.jsp" };

        // Otherwise, fallback to the standard configuration
        /*return defaultDecoratorSelector.selectDecoratorPaths(content, webAppContext);*/
    }
}
