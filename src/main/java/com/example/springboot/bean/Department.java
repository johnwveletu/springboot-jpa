package com.example.springboot.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mybatis_department")
public class Department implements Serializable {
    private static final long serialVersionUID = -6447267952475657998L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "dept_name", length = 100)
    private String deptName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }


    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
