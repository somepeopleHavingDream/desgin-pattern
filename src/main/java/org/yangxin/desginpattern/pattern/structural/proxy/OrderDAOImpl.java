package org.yangxin.desginpattern.pattern.structural.proxy;

/**
 * @author yangxin
 * 2020/03/07 21:21
 */
public class OrderDAOImpl implements IOrderDAO {
    @Override
    public int insert(Order order) {
        System.out.println("DAO层添加Order成功");
        return 1;
    }
}
