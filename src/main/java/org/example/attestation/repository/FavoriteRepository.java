package org.example.attestation.repository;

import org.example.attestation.model.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
    // Методы для работы с избранными записями, например, поиск всех избранных для пользователя
    List<Favorite> findByUserId(Long userId);
    List<Favorite> findByResourceId(Long resourceId);
}
