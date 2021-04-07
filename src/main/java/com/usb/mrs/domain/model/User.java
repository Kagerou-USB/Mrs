package com.usb.mrs.domain.model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

/**
 * ユーザ
 * @author USB
 *
 */
@Entity
@Table(name = "user")
@Getter
@Setter
public class User implements Serializable {
    
    @Id
    // ユーザID
    private String userId;
    
    // パスワード
    private String password;
    
    // 名前
    private String firstName;
    
    // 名字
    private String lastName;
    
    @Enumerated(EnumType.STRING)
    private RoleName roleName;     
}
