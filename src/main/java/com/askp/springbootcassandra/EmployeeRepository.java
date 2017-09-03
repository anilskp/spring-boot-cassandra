package com.askp.springbootcassandra;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,String> {


    @Query("Select * from employee where name=?0")
    public Employee findByName(String firstName);

    @Query("Select * from employee where dept=?0")
    public List<Employee> findByDepName(String lastName);
}
