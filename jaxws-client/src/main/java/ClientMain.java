import com.zyb.service.UserService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * @Description:
 * @Author: zhangyongbin
 * @Date: 2020/9/22 10:14
 */
public class ClientMain {

    public static void main(String[] args) {
        //创建cxf代理工厂
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();

        //设置远程方位服务端地址
        factoryBean.setAddress("http://localhost:8000/jaxws_server");

        //设置接口类型
        factoryBean.setServiceClass(UserService.class);

        //对接口生成代理对象
        UserService userService = (UserService) factoryBean.create();

        //  代理对象对象  class com.sun.proxy.$Proxy34       [Java代理： 1. 静态代理；  2.动态代理（jdk接口代理、cglib子类代理）]    $CGLIB123
        System.out.println(userService.getClass());

        //远程访问服务端方法
        String returnVal = userService.addUser("zhangsan", 18);

        System.out.println(returnVal);
    }
}
