package com.recycling.DB.repository;
import com.recycling.recycling.production.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface UsersRepository extends JpaRepository<User, Integer> {
}
