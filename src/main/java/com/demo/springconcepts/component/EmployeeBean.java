package com.demo.springconcepts.component;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private int eid;
    private String ename;

    @Autowired
    private DepartmentBean deptBean;
    public static final Logger logger=LoggerFactory.getLogger(EmployeeBean.class);

    public EmployeeBean() {}

    @Autowired
    public EmployeeBean(DepartmentBean deptBean) {
        logger.trace("**Autowiring in constructor***");
        this.deptBean=deptBean;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public DepartmentBean getDeptBean() {
        return deptBean;
    }

    @Autowired
    public void setDeptBean(DepartmentBean deptBean) {
        logger.trace("**Autowiring in setter*****");
        this.deptBean = deptBean;
    }
    public void showEmployeeDetails() {
        logger.debug("Employee id: "+eid);
        logger.debug("Employee name: "+ename);
        deptBean.setDeptName("Innovative Resources");
        logger.debug("Employee Department: "+deptBean.getDeptName());

    }
    
}
