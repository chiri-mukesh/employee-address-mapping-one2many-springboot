package com.rinfotek.springdatajpamappings.repository;

import com.rinfotek.springdatajpamappings.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
