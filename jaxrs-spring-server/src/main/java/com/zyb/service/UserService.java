package com.zyb.service;

import com.zyb.entity.User;

import javax.ws.rs.*;

/**
 * @Description:
 * @Author: zhangyongbin
 * @Date: 2020/9/23 10:39
 */
//  访问当前服务接口对应的路径
@Path("/userService")
@Produces("*/*")  // 服务器支持的返回的数据格式类型
public interface UserService {

    // 表示处理的请求的类型，post 对应的是insert新增操作
    @POST
    // 访问当前服务接口方法对应的路径。 【.../userService/user】
    @Path("/user")
    //  服务器支持的请求的数据格式类型
    @Consumes({"application/json" })
//    @Consumes({ "application/xml", "application/json" })
    public void saveUser(User user);

    @GET
    @Path("/user/{id}")
    @Consumes("application/xml")
    @Produces({ "application/json" })
    public User finUserById(@PathParam("id") Integer id);
}
