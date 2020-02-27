package org.yangxin.desginpattern.principle.compositionaggregation;

/**
 * @author yangxin
 * 2020/02/27 17:20
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
