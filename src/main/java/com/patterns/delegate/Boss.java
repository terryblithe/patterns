package com.patterns.delegate;

/**
 * 委派模式：
 *  自己不做事，将任务分配给下级去做（老板->经理->员工）
 *  代理模式 + 策略模式的特殊组合
 *  核心：分发、调度、派遣
 *
 *  例子：
 *      老板将任务委派给项目经理，项目经理将任务细化，根据每个人擅长的某一方面将细化后的任务分给指定的员工，
 *      权衡的方式（策略）有多种，而这个任务项目经理不想干，就将其代理给了各个员工，从这个层面来看委派模式
 *      就是策略模式和代理模式的组合
 *
 *      Spring MVC框架中的DispatcherServlet用到的就是委派模式
 */
public class Boss {

    private Leader leader;

    public Boss(Leader leader) {
        this.leader = leader;
    }

    public void doWork() {
        leader.doWorkA();
        leader.doWorkB();
    }

}
