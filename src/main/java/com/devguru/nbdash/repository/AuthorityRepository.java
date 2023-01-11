package com.devguru.nbdash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devguru.nbdash.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
