package com.security.security3.repositories;

import com.security.security3.beans.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestTable,Integer> {
}
