package com.lucaasgevaerd.client_crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucaasgevaerd.client_crud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
