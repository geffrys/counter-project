package com.geff.nopmocounter.infraestructure.repository.adapter;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.geff.nopmocounter.infraestructure.repository.entity.UserEntity;

public interface JpaCounterRepository extends PagingAndSortingRepository<UserEntity, Long> {
    
}
