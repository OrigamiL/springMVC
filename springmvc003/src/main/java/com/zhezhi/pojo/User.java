package com.zhezhi.pojo;

import lombok.*;

/**
 * @Program: springMVC
 * @ClassName: User
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-09 10:31
 **/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class User {
    private String name;
    private int age;
}
