package com.geff.nopmocounter.infraestructure.repository.entity;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "user_counters")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CounterEntity {
    @Id
    @Column(name = "counter_id")
    private Long counterId;
    @Column(name = "counter_user_id")
    private Long counterUserId;
    @Column(name = "start_time")
    private Instant startTime;
    @Column(name = "finish_time")
    private Instant finishTime;
    @Column(name = "created_at")
    private Instant createdAt;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
