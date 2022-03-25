package com.ktun.crudapp.StudentRepository;

import com.ktun.crudapp.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
