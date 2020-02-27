package org.yangxin.desginpattern.principle.compositionaggregation;

/**
 * @author yangxin
 * 2020/02/27 16:30
 */
public class ProductDAO {
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String connection = dbConnection.getConnection();
        System.out.println("使用" + connection + "增加产品");
    }
}
