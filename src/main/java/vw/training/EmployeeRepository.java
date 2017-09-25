package vw.training;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by digitallab on 25/09/17.
 */
public interface EmployeeRepository extends CrudRepository<Employee,Long> {
    public List<Employee> findByLastName(String lastName);
}
