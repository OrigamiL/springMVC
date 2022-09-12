package com.zhezhi.pojo;

import lombok.*;

import java.util.Date;

/**
 * @Program: springMVC
 * @ClassName: Students
 * @Version: 1.0
 * @Description:
 * @Author: zhezhi
 * @Create-Date: 2022-09-12 10:29
 **/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Students {
    private String name;
    private Date birth;
}
