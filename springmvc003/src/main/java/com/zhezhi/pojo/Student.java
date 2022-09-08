package com.zhezhi.pojo;

import lombok.*;

/**
 * @Program: springMVC
 * @ClassName: Student
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-07 11:14
 **/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Student {
    private String name;
    private int age;
}
