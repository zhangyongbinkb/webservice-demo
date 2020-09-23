import com.zyb.service.impl.UserService;
import com.zyb.service.impl.UserServiceImplService;

/**
 * @Description:
 * @Author: zhangyongbin
 * @Date: 2020/9/22 11:38
 */
public class ClientMain {

    /**
     * 自动生成客户端代码
     * 下载安装 apache-cxf-3.3.7包 解压
     * 到cxf bin目录下执行wsdl2java http://localhost:8000/jaxws_server?wsdl
     * 将自动生成的代码放到项目中，可以删除无关类只保留接口和其实现类。
     * 注意接口的 @XmlSeeAlso({ObjectFactory.class})，需要去掉
     */
    public static void main(String[] args) {
        UserService userService = new UserServiceImplService().getUserServiceImplPort();
        String returnVal = userService.addUser("lisi", 12);
        System.out.println(returnVal);
    }
}
