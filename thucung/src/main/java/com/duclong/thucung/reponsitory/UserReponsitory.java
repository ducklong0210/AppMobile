package com.duclong.thucung.reponsitory;

import com.duclong.thucung.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReponsitory  extends JpaRepository<User, Integer> {
}
