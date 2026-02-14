package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.entities.Profile;

public interface ProfileRepository extends CrudRepository<Profile,Long> {}
