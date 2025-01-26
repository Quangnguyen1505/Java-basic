package com.test.javabasic.repository;

import com.test.javabasic.entity.user.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//Annatation
//@RepositoryDefinition(domainClass = UserEntity.class, idClass = Long.class) // cach 1
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // find username and userEmail
    // cơ chế findByUsernameAndUserEmail -> UsernameAndUserEmail -> usernameAndUserEmail -> usernameAnduserEmail
    // sau khi lọc xong sẽ tìm trong entity
    // where userName = $1 and userEmail = $2
    UserEntity findByUserNameAndUserEmail(String userName, String userEmail);

    UserEntity findByUserName(String username);

    /**
     * Where userName LIKE %?
     */
    List<UserEntity> findByUserNameStartingWith(String userName);

    /**
     * Where userName LIKE ?%
     */
    List<UserEntity> findByUserNameEndingWith(String userName);

    /**
     * Where userName < 1
     * @param userName
     * @return
     */
    List<UserEntity> findByUserNameLessThan(String userName);

    //RAW JPQL
    @Query("SELECT u FROM UserEntity u WHERE u.id = (SELECT MAX(p.id) FROM UserEntity p)")
    UserEntity findMaxId();

    @Query("SELECT u FROM UserEntity u WHERE u.userName = ?1 AND u.userEmail = ?2")
    List<UserEntity> getUserEntityBy(String userName, String userEmail);

    @Query("SELECT u FROM UserEntity u WHERE u.userName = :userName AND u.userEmail = :userEmail")
    List<UserEntity> getUserEntityByTwo(@Param("userName") String userName, @Param("userEmail") String userEmail);

    // trong query chi cho phep update va delete chu insert khong ho tro

    /**
     * UPDATE DELETE
     */
    @Modifying
    @Query("UPDATE UserEntity u SET u.userEmail = :userName")
    @Transactional
    int updateUserName(@Param("userName") String userName);

    //native query
    /**
     * Get count user use native query
     * not recommend method this
     */
    @Query(value = "SELECT COUNT(id) FROM java_user_001", nativeQuery = true)
    long getTotalUser();
}
