package com.zyb.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @Description:
 * @Author: zhangyongbin
 * @Date: 2020/9/22 10:59
 */

/**
 * 针对：wsdl信息不全问题： webservice接口和实现类要放在同一层级的包下，才能显示全的信息
 * 如果不放在同一级，就需要指定targetNamespace， 接口和实现类都需要加，而且需要加一样的
 */
@WebService(targetNamespace = "http://impl.service.zyb.com/")
public interface UserService {

    @WebMethod
    @WebResult(name = "reValMessage")
    public String addUser(@WebParam(name = "name") String name, @WebParam(name = "age") int age);
}
