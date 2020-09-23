import com.zyb.service.impl.UserServiceImpl;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * @Description:
 * @Author: zhangyongbin
 * @Date: 2020/9/22 15:30
 */
public class ServerMain {

    public static void main(String[] args) {
        // 发布服务工厂
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        //设置服务地址
        factoryBean.setAddress("http://localhost:8000/jaxws_server");
        //设置服务类
        factoryBean.setServiceBean(new UserServiceImpl());

        //  添加日志输入、输出拦截器，观察soap请求、soap响应内容
        factoryBean.getInInterceptors().add(new LoggingInInterceptor());
        factoryBean.getOutInterceptors().add(new LoggingOutInterceptor());

        //发布服务
        Server server = factoryBean.create();
        server.start();

        System.out.println("发布服务成功，端口8000.....");
    }
}
