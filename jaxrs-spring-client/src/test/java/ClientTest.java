import com.zyb.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

/**
 * @Description:
 * @Author: zhangyongbin
 * @Date: 2020/9/23 11:26
 */
public class ClientTest {

    @Test
    public void testSave(){
        User user = new User();
        user.setId(100);
        user.setUsername("Jerry");
        user.setCity("gz");
        // 通过WebClient对象远程调用服务端
        WebClient
                .create("http://localhost:8080/ws/jaxrs/userService/user")
                .type(MediaType.APPLICATION_JSON)  // 指定请求的数据格式为json
                .post(user);
    }

    @Test
    public void testGet(){
        // 查询一个
        User user =
                WebClient
                        .create("http://localhost:8080/ws/jaxrs/userService/user/1")
                        .accept(MediaType.APPLICATION_JSON)
                        .get(User.class);
        System.out.println(user);
    }
}
