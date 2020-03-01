package com.medos.rates.medossrvicesrates.repo;

import com.medos.rates.medossrvicesrates.model.UserRates;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserRates, Integer> {
    Optional<UserRates> findByUsername(String username);
}
