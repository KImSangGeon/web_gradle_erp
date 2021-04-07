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
import web_gradle_erp.dto.Title;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TitleDaoImplTest {

	private static Connection con;
	private TitleDaoImpl dao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		con = JdbcUtil.getConnection();
	}

	@Before
	public void setUp() throws Exception {
		dao = TitleDaoImpl.getInstance();
		dao.setCon(con);
	}

	@Test
	public void test01SelectTitleByAll() {
		System.out.printf("%s%n", "testSelectTitleByAll");
		List<Title> titleList = dao.selectTitleByAll();
		Assert.assertNotNull(titleList);
		for (Title t : titleList) {
			System.out.println(t);
		}
	}

	@Test
	public void test02SelectTitleByNO() {
		System.out.printf("%s%n", "testSelectTitleByNO");
		Title title = new Title(4);
		Title select = dao.selectTitleByNO(title);
		Assert.assertNotNull(select);
		System.out.println(select);
	}

	@Test
	public void test03InsertTitle() {
		System.out.printf("%s%n", "testInsertTitle");
		Title title = new Title(6, "인턴");
		int res = dao.insertTitle(title);
		Assert.assertEquals(1, res);
		System.out.println(dao.selectTitleByNO(title));
	}

	@Test
	public void test05UpdateTitle() {
		System.out.printf("%s%n", "test05UpdateTitle");
		Title title = new Title(7, "인턴짱");
		int res = dao.updateTitle(title);
		Assert.assertEquals(1, res);
		System.out.println(dao.selectTitleByNO(title));
	}

	@Test
	public void test04DeleteTitle() {
		System.out.printf("%s%n", "testDeleteTitle");
		int res = dao.deleteTitle(new Title(6));
		Assert.assertEquals(1, res);
		dao.selectTitleByAll().stream().forEach(System.out::println);
	}

}
