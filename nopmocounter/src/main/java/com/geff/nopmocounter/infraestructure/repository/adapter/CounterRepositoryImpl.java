package com.geff.nopmocounter.infraestructure.repository.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

import com.geff.nopmocounter.domain.entity.Counter;
import com.geff.nopmocounter.domain.repository.CounterRepository;

@Getter
@Setter
@AllArgsConstructor
public class CounterRepositoryImpl  implements CounterRepository {
    private final JpaCounterRepository jpaCounterRepository;

    @Override
    public Optional<Counter> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Optional<Counter> findByUserId(Long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByUserId'");
    }

    @Override
    public Counter save(Counter counter) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    
}
