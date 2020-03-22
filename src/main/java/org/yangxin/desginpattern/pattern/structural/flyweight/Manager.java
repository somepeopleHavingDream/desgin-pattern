package org.yangxin.desginpattern.pattern.structural.flyweight;

/**
 * @author yangxin
 * 2020/03/22 21:28
 */
public class Manager implements Employee {

    private String department;
    private String reportContent;

    public Manager(String reportContent) {
        this.reportContent = reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }
}
