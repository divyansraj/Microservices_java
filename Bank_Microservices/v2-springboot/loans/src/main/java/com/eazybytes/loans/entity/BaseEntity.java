package com.eazybytes.loans.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
@ToString
public class BaseEntity {
    @Column(updatable = false)
    @CreatedBy
    private String createdBy;


    @Column(updatable = false)
    @CreatedDate
    private LocalDateTime createdAt;


    @Column(updatable = false)
    @LastModifiedBy
    private String updatedBy;


    @Column(updatable = false)
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
