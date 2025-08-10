package com.geff.nopmocounter.infraestructure.repository.mapper;
import com.geff.nopmocounter.domain.entity.Counter;
import com.geff.nopmocounter.infraestructure.repository.entity.CounterEntity;

public class CounterMapper {
    public static Counter toCounter(CounterEntity entity) {
        if (entity == null) {
            return null;
        }
        Counter counter = new Counter();
        counter.setCounterId(entity.getCounterId());
        counter.setUserId(entity.getCounterUserId());
        counter.setStartTime(entity.getStartTime());
        counter.setFinishTime(entity.getFinishTime());
        counter.setCreatedAt(entity.getCreatedAt());
        return counter;
    }

    public static CounterEntity toEntity(Counter counter) {
        if (counter == null) {
            return null;
        }
        CounterEntity entity = new CounterEntity();
        entity.setCounterId(counter.getCounterId());
        entity.setCounterUserId(counter.getUserId());
        entity.setStartTime(counter.getStartTime());
        entity.setFinishTime(counter.getFinishTime());
        entity.setCreatedAt(counter.getCreatedAt());
        return entity;
    }
}
