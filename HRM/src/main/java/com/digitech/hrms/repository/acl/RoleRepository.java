package com.digitech.hrms.repository.acl;

import com.digitech.hrms.entity.acl.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role getRoleByRoleName(String roleName);
}
