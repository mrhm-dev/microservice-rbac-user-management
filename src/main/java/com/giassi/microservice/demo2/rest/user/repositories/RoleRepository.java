package com.giassi.microservice.demo2.rest.user.repositories;

import com.giassi.microservice.demo2.rest.user.entities.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findById(long roleId);

}