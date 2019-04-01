package org.gege.write.spring.v1.mvc;

import com.sun.jndi.toolkit.url.UrlUtil;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @Description:
 * @Author: gege
 * @CreateDate: 2019/3/28 17:36
 */
public class DispatcherServlet  extends HttpServlet {

    private Map<String ,Object > ioc = new HashMap<String,Object>();

    //加载配置文件内容  初始化spring容器
    @Override
    public void init(ServletConfig config) throws ServletException {

        try {
            initConfigfile(config);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initConfigfile(ServletConfig config) throws IOException {
        //加载配置文件配置内容
        String filename = config.getInitParameter("contextConfigLocation");
        Properties properties = new Properties();
        properties.load(this.getClass().getClassLoader().getResourceAsStream(filename));
        String rootpackage = properties.getProperty("scanner.package");

        //扫描配置文件类下所有的包 根据注解初始化IOC容器
        doScanner(rootpackage );

    }

    String  a ="";
    private void doScanner(String rootpackage) {
        URL url = this.getClass().getClassLoader().getResource("/"+rootpackage.replaceAll("\\.","/"));
        File file = new File(url.getFile());
        if(file.isDirectory())
            doScanner(rootpackage+"."+file.getName());
        else {
            System.out.println(file.getName());
            a+="---";
        }
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }


}
