package com.nayan.department.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nayan.department.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department findById(long id);

//	@Query(value="SELECT e.* FROM employee e WHERE e.dept_id=:id ", nativeQuery = true)
//	List<Employee> empByDept(@Param("id") long id);
}
