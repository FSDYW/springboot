package com.viyoung.springboot.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Vi-Young
 */
public interface UserRepository extends JpaRepository<User,Long> {

    /**
     * 根据用户名查找用户
     * @param userName
     * @return
     */
    User findByUserName(String userName);

    /**
     * 根据用户名或者邮箱查找用户
     * @param userName
     * @param email
     * @return
     */
    User findByUserNameOrEmail(String userName, String email);
}
