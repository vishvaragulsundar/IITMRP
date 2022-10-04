package com.secondcrudapplication.com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.secondcrudapplication.com.employee.bean.*;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
