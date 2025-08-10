package com.geff.nopmocounter.infraestructure.repository.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

import com.geff.nopmocounter.domain.entity.Counter;
import com.geff.nopmocounter.domain.repository.CounterRepository;
import com.geff.nopmocounter.infraestructure.repository.entity.CounterEntity;
import com.geff.nopmocounter.infraestructure.repository.mapper.CounterMapper;

@Getter
@Setter
@AllArgsConstructor
public class CounterRepositoryImpl  implements CounterRepository {
    private final JpaCounterRepository jpaCounterRepository;

    @Override
    public Optional<Counter> findById(Long id) {

        return jpaCounterRepository.findById(id).map(CounterMapper::toCounter);
    }

    @Override
    public Optional<Counter> findByUserId(Long userId) {
        return jpaCounterRepository.findByUserId(userId).map(CounterMapper::toCounter);
    }

    
    public Counter save(CounterEntity counter) {
        return jpaCounterRepository.save(counter).map(CounterMapper::toCounter).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        jpaCounterRepository.deleteById(id);
    }

}
