package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.entities.Address;

public interface AddressRepository extends CrudRepository<Address,Long>{}
