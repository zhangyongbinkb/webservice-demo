import com.zyb.service.UserServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * @Description:
 * @Author: zhangyongbin
 * @Date: 2020/9/23 10:51
 */
public class ServerMain {

    public static void main(String[] args) {
        // 创建发布服务的工厂
        JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();

        // 设置服务地址
        factory.setAddress("http://localhost:8001/jaxrs-server/");

        // 设置服务类
        factory.setServiceBean(new UserServiceImpl());

        // 添加日志输入输出拦截器
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());

        // 发布服务
        factory.create();

        System.out.println("发布服务成功，端口8001");
    }
}
