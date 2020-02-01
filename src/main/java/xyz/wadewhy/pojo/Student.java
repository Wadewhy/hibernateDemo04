/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.pojo 
 * @author: wadewhy   
 * @date: 2020年2月1日 下午7:03:37 
 */
package xyz.wadewhy.pojo;

import java.util.HashSet;
import java.util.Set;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年2月1日 下午7:03:37
* 类说明
*/
/**
 * @ClassName: Student
 * @Description: TODO
 * @author: wadewhy
 * @date: 2020年2月1日 下午7:03:37
 */
public class Student {
    private Integer id; // 学生id
    private String sname; // 学生姓名

    // 一门课程都可以被多个学生学习
    private Set<Course> courses = new HashSet<Course>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}