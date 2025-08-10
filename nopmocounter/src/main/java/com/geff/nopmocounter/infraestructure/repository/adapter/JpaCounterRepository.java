package com.geff.nopmocounter.infraestructure.repository.adapter;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.geff.nopmocounter.infraestructure.repository.entity.CounterEntity;

public interface JpaCounterRepository extends PagingAndSortingRepository<CounterEntity, Long> {
    Optional<CounterEntity> findByUserId(Long userId);
    Optional<CounterEntity> findById(Long id);
    Optional<CounterEntity> save(CounterEntity counter);
    void deleteById(Long id);
}
