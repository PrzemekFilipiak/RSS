package com.zdjavapol110.rss.core.modules.user.service.dto;

import com.zdjavapol110.rss.core.modules.user.UserRole;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "book")
@Getter
@Setter
@ToString
@Accessors(fluent = false, chain = true)
public class UserDto {

    private long id;

    private String uuid;

    private String email;

    private String firstName;

    private String lastName;

    private String username;

    private String password;

    private UserRole role;
}