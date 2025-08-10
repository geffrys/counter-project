package com.geff.nopmocounter.domain.repository;
import com.geff.nopmocounter.domain.entity.Counter;
import java.util.Optional;

public interface CounterRepository {
    Optional<Counter> findById(Long id);
    Optional<Counter> findByUserId(Long userId);
    void deleteById(Long id);
}
