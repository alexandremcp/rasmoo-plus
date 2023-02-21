package com.client.ws.rasmooplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.ws.rasmooplus.model.SubscriptionType;

@Repository
public interface SubscriptionTypeRepository extends JpaRepository<SubscriptionType, Long> {  
}

/*
 * SubscriptionTypeRepository
 * **************************
 * Responsável pela interação com o banco de dados para realizar operações relacionadas ao usuário, como busca, criação, atualização e exclusão.
 */
