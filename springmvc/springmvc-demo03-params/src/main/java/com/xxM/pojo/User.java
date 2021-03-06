package com.xxM.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Program: IntelliJ IDEA springmvc
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-14 09:56:04 周一
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
@Data
public class User implements Serializable {
    private String username;
    private String password;
    private Integer age;
    private List<Account> accounts;
}
