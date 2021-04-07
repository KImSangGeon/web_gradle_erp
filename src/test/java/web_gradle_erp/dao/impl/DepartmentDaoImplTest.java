package web_gradle_erp.dao.impl;

import java.sql.Connection;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import web_gradle_erp.ds.JdbcUtil;
import web_gradle_erp.dto.Department;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DepartmentDaoImplTest {
	private static Connection con;
	private DepartmentDaoImpl dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		con = JdbcUtil.getConnection();
	}

	@Before
	public void setUp() throws Exception {
		dao = DepartmentDaoImpl.getInstance();
		dao.setCon(con);
	}

	@Test
	public void test01SelectDeptByAll() {
		System.out.printf("%s%n", "testSelectDeptByAll");
		List<Department> deptList = dao.SelectDeptByAll();
		Assert.assertNotNull(deptList);
		for(Department d : deptList) {
			System.out.println(d);
		}		
	}

	@Test
	public void test02SelectDeptByNo() {
		System.out.printf("%s%n", "testSelectDeptByNo");
		Department selectDept = new Department(3);
		Department seDept = dao.SelectDeptByNo(selectDept);
		Assert.assertNotNull(seDept);
		System.out.println(seDept);
	}

	@Test
	public void test03InsertDept() {
		System.out.printf("%s%n", "testInsertDept");
		Department addDept = new Department(5, "인사", 2);
		int res = dao.insertDept(addDept);
		Assert.assertEquals(1, res);
		System.out.println(dao.SelectDeptByNo(addDept));
	}

	@Test
	public void test04UpdateDept() {
		System.out.printf("%s%n", "test04UpdateDept");
		Department updateDept = new Department(5, "발라드", 7 );
		int res = dao.updateDept(updateDept);
		Assert.assertEquals(1, res);
		System.out.println(dao.SelectDeptByNo(updateDept));
	}

	@Test
	public void test05DeleteDept() {
		System.out.printf("%s%n", "testDeleteDept");
		int res = dao.deleteDept(new Department(5));
		Assert.assertEquals(1, res);
		System.out.println(dao.SelectDeptByAll());
	}

}
