package com.security.security3.services;

import com.security.security3.beans.TestTable;

import java.util.List;
import java.util.Optional;

public interface TestService {

    public List<TestTable> getAll();

    public Optional<TestTable> getById(int id);

    public Optional<TestTable> save(TestTable testTable);

    public Optional<TestTable> deleteById(int id);

    public List<TestTable> update(TestTable testTable);

}
