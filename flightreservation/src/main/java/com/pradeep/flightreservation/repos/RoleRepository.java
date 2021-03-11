package com.pradeep.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pradeep.flightreservation.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
