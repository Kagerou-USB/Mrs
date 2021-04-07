package com.usb.mrs.domain.model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;


/**
 * 会議室
 * @author USB
 *
 */
@Entity
@Getter
@Setter
public class MeetingRoom implements Serializable {
    
    // ルーム番号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomId;
    
    // ルーム名
    private String roomName;
}
