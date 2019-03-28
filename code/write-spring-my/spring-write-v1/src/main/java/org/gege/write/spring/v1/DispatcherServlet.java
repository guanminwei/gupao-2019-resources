package org.gege.write.spring.v1;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description:
 * @Author: gege
 * @CreateDate: 2019/3/28 17:36
 */
public class DispatcherServlet  extends HttpServlet {

    //加载配置文件内容  初始化spring容器
    @Override
    public void init(ServletConfig config) throws ServletException {

    }



    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }


}
