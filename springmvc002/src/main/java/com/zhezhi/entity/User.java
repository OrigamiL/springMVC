package com.zhezhi.entity;

import lombok.*;

/**
 * @Program: springMVC
 * @ClassName: User
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-05 10:56
 **/

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User {

    private String name;
    private int age;

}
