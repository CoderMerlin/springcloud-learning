package com.hm.cloud.common.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Merlin
 * @Title: User
 * @ProjectName springcloud-learning
 * @Description: TODO
 * @date 2020/8/2514:57
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;

    private String username;

    private String password;


}
