package com.hm.cloud.service;

import com.hm.cloud.domain.User;

import java.util.List;

/**
 * @author Merlin
 * @Title: UserService
 * @ProjectName springcloud-learning
 * @Description: TODO
 * @date 2020/8/2515:17
 */
public interface UserService {


    void create(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Long> ids);
}
