package org.yangxin.desginpattern.pattern.structural.proxy.dynamicproxy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.yangxin.desginpattern.pattern.structural.proxy.Order;
import org.yangxin.desginpattern.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 订单服务动态代理
 *
 * @author yangxin
 * 2020/03/07 22:00
 */
@SuppressWarnings("CommentedOutCode")
@AllArgsConstructor
@NoArgsConstructor
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    Object bind() {
        Class<?> aClass = target.getClass();
        System.out.println("aClass.getClassLoader: " + aClass.getClassLoader());
        System.out.println("aClass.getInterfaces: " + Arrays.toString(aClass.getInterfaces()));
        // 这里会代理target类的所有方法
        return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        Object argObject = args[0];
//        beforeMethod(argObject);
        Object invoke = method.invoke(target, args);
        afterMethod();

        return invoke;
    }

    private void beforeMethod(Object object) {
        System.out.println("动态代理 before code");

        int userId = 0;
        if (object instanceof Order) {
            Order order = (Order) object;
            userId = order.getUserId();
        }

        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db" + dbRouter + "】" + "处理数据");

        // 设置dataSource
        DataSourceContextHolder.setDBType("db" + dbRouter);
    }

    private void afterMethod() {
        System.out.println("动态代理 after code");
    }
}
