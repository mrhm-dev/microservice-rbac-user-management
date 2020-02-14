package com.giassi.microservice.demo2.rest.users.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Support the creation of a new user account with a minimum set of required data
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateUserAccountDTO implements Serializable {

    private String username;
    private String name;
    private String surname;
    private String email;
    private String gender;

}