package com.geff.nopmocounter.infraestructure.repository.entity;

import java.time.Instant;
import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "user_email")
    private String userEmail;
    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "is_locked")
    private Boolean isLocked;
    @Column(name = "created_at")
    private Instant createdAt;
    @Column(name = "updated_at")
    private Instant updatedAt;
    @OneToMany(mappedBy = "user", cascade = jakarta.persistence.CascadeType.ALL, orphanRemoval = true)
    private List<CounterEntity> counters;
}
