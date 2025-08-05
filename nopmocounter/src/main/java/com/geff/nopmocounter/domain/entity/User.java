package com.geff.nopmocounter.domain.entity;

import java.time.Instant;

public class User {
    private Long userId;
    private String userEmail;
    private String userPassword;
    private Boolean isActive;
    private Boolean isLocked;
    private Instant createdAt;
    private Instant updatedAt;

    public User(){

    }

    public User(Long userId, String userEmail, String userPassword, Boolean isActive, Boolean isLocked, Instant createdAt, Instant updatedAt){
        this.setUserId(userId);
        this.setUserEmail(userEmail);
        this.setUserPassword(userPassword);
        this.setIsActive(isActive);
        this.setIsLocked(isLocked);
        this.setCreatedAt(createdAt);
        this.setUpdatedAt(updatedAt);
    }
    
    public Long getUserId(){
        return this.userId;
    }
    public String getUserEmail(){
        return this.userEmail;
    }
    public String getUserPassword(){
        return this.userPassword;
    }
    public Boolean getIsActive(){
        return this.isActive;
    }
    public Boolean getIsLocked(){
        return this.isLocked;
    }
    public Instant getCreatedAt(){
        return this.createdAt;
    }
    public Instant getUpdatedAt(){
        return this.updatedAt;
    }
    

    public void setUserId(Long userId){
        this.userId = userId;
    }
    public void setUserEmail(String userEmail){
        this.userEmail = userEmail;
    }
    public void setUserPassword(String userPassword){
        this.userPassword = userPassword;
    }
    public void setIsActive(Boolean isActive){
        this.isActive = isActive;
    }
    public void setIsLocked(Boolean isLocked){
        this.isLocked = isLocked;
    }
    public void setCreatedAt(Instant createdAt){
        this.createdAt = createdAt;
    }
    public void setUpdatedAt(Instant updatedAt){
        this.updatedAt = updatedAt;
    }
}
