package com.example.konkatenazia.db.impls;

import com.example.konkatenazia.db.interfaces.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void addUser(String username, String name, String telegram) {
        entityManager.createQuery("INSERT INTO User(username, name, telegram) VALUES (:username, :name, :telegram)")
                .setParameter("username", username)
                .setParameter("name", name)
                .setParameter("telegram", telegram)
                .executeUpdate();
    }

}
