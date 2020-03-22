package org.yangxin.desginpattern.pattern.behavioral.chainofresponsibility;

/**
 * @author yangxin
 * 2020/03/22 14:53
 */
public abstract class Approver {

    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
