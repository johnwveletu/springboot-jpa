package com.example.springboot.bean;


import javax.persistence.*;
import java.io.Serializable;

//使用JPA注解配置映射关系
@Entity //此注解告诉JPA这是一个实体类
@Table(name = "mybatis_employee") //此注解用来指明和哪个表对应，默认使用类名的小写
public class Employee implements Serializable {

    private static final long serialVersionUID = -5203201650268795891L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //这里指定主键使用自增策略
    private Integer id;
    @Column(name = "last_name", length = 100)
    private String lastName;
    @Column(name = "email", length = 100)
    private String email;
    @Column(name = "d_id")
    private Integer did;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", did=" + did +
                '}';
    }
}
