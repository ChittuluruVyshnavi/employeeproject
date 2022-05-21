package employee.example.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import employee.example.employee.model.employee;

@Repository
public interface employeerepository extends JpaRepository<employee,Long> {

}
