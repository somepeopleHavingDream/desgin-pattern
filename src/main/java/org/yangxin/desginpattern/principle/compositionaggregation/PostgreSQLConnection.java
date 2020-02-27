package org.yangxin.desginpattern.principle.compositionaggregation;

/**
 * @author yangxin
 * 2020/02/27 17:20
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "Postgre数据库连接";
    }
}
