package com.geff.nopmocounter.domain.entity;

import java.time.Instant;

public class Counter {
    private Long counterId;
    private Long userId;
    private Instant startTime;
    private Instant finishTime;
    private Instant createdAt;

    public Counter(){}
    
    public Counter(Long counterId, Long userId, Instant startTime, Instant finishTime, Instant createdAt){
        setCounterId(counterId);
        setUserId(userId);
        setStartTime(startTime);
        setFinishTime(finishTime);
    }

    public Long getCounterId() {
        return counterId;
    }
    public Instant getFinishTime() {
        return finishTime;
    }
    public Instant getStartTime() {
        return startTime;
    }
    public Long getUserId() {
        return userId;
    }
    public Instant getCreatedAt(){
        return createdAt;
    }

    public void setCounterId(Long counterId) {
        this.counterId = counterId;
    }
    public void setFinishTime(Instant finishTime) {
        this.finishTime = finishTime;
    }
    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public void setCreatedAt(Instant createdAt){
        this.createdAt = createdAt;
    }
}

