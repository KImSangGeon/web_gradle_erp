package web_gradle_erp.dao;

import java.util.List;

import web_gradle_erp.dto.Department;

public interface DepartmentDao {
	List<Department> SelectDeptByAll();
	Department SelectDeptByNo(Department	department);
	
	int  insertDept(Department department);
	int updateDept(Department department);
	int deleteDept(Department department);
	
	

}
