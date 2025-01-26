package com.test.javabasic.entity.user;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@Table(name = "java_user_001")
@DynamicInsert // chi bao gom cac cot co value bo qua cac cot khong co value
@DynamicUpdate
public class UserEntity {
    @Id
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //neu khong co strategy se sinh ra 1 bang
    private Long id;

    @Column(name = "userName", nullable = false, unique = true, length = 100)
    private String userName;

    @Column(name = "userEmail", nullable = false, unique = true)
    private String userEmail;
}
