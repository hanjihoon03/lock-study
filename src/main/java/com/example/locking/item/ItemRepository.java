package com.example.locking.item;

import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;

/**
 * @author : hanjihoon
 * @Date : 2025. 03. 29.
 */
public interface ItemRepository extends JpaRepository<Item, Long> {
    @Lock(LockModeType.PESSIMISTIC_WRITE)  // 비관적 락 적용
    @Query("select i from Item i where i.id = :id")
    Item findByIdWithLock(Long id);
}