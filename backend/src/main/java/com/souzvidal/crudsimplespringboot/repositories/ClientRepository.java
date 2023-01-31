package com.souzvidal.crudsimplespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.souzvidal.crudsimplespringboot.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
