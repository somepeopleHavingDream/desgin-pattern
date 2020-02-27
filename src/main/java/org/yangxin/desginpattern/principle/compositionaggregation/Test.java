package org.yangxin.desginpattern.principle.compositionaggregation;

/**
 * @author yangxin
 * 2020/02/27 16:31
 */
public class Test {
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();
        productDAO.setDbConnection(new MySQLConnection());
        productDAO.addProduct();
    }
}
