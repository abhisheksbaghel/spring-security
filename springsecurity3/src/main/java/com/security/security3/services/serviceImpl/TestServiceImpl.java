package com.security.security3.services.serviceImpl;

import com.security.security3.beans.TestTable;
import com.security.security3.repositories.TestRepository;
import com.security.security3.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepository;
    @Override
    public List<TestTable> getAll() {
        return testRepository.findAll();
    }

    @Override
    public Optional<TestTable> getById(int id) {
        return testRepository.findById(id);
    }

    @Override
    public Optional<TestTable> save(TestTable testTable) {
        int id= testTable.getId();
        testRepository.save(testTable);
        return testRepository.findById(id);
    }

    @Override
    public Optional<TestTable> deleteById(int id) {
        testRepository.deleteById(id);
        return testRepository.findById(id);
    }

    @Override
    public List<TestTable> update(TestTable testTable) {
        List<TestTable> testList=testRepository.findById(testTable.getId()).stream().toList();
        for(TestTable testTable1 : testList)
        {
            testTable1= new TestTable(testTable.getId(),testTable.getName(),testTable.getContent());
        }
        return testList;
    }
}
