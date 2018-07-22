package com.neuedu.lvcity.common;

import org.junit.Before;
import org.junit.Test;


public class DBUtilsTest {

	@Before
	public void setUp() throws Exception {
	}
	/**
	 * 测试是否连接上mysql数据库
	 */

	@Test
	public void testGetConnection() {
		java.sql.Connection conn = DBUtils.getConnection();
		System.out.println(conn);
		
		

	}

}
