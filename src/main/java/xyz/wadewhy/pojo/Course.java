/**   
 * Copyright © 2020 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: xyz.wadewhy.pojo 
 * @author: wadewhy   
 * @date: 2020年2月1日 下午7:04:17 
 */
package xyz.wadewhy.pojo;

import java.util.HashSet;
import java.util.Set;

/**
* @author 钟子豪
* 作者 E-mail:wadewhy@yeah.net
* @version 创建时间：2020年2月1日 下午7:04:17
* 类说明
*/
/**
 * @ClassName: Course
 * @Description: TODO
 * @author: wadewhy
 * @date: 2020年2月1日 下午7:04:17
 */
public class Course {
    private Integer id; // 课程id
    private String cname; // 课程名称

    // 一个学生可以学习多门课程
    private Set<Student> students = new HashSet<Student>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

}