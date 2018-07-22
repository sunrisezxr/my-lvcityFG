package com.lingnan.usersys.commom.util;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * 获取数据库连接，开启、提交、回滚事物，关闭连接，关闭statement
 * @author Administrator
 *
 */
public class DBUtils {
	/**
	 * 获取数据库连接
	 * @return
	 * @throws SQLException 
	 */

	public static Connection getconnection() throws SQLException{
		Connection conn=null;
		try {
			//加载驱动
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:ORCL";
			String user="scott";
			String password="aBC123456";
			//获得数据库连接对象
			conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			//将异常封装成自定义异常
			//throw new Daoexxeption("不能建立数据库连接",e);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//返回得到的连接对象
		return conn;
	}
	/**
	 * 开启事物
	 * @param conn
	 */
	
	public  static void beginTransaction(Connection conn){
		try {
			//将事物的自动提交模式设为假
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//将异常封装成自定义异常
			//throw new DaoExection("事物开启失败",e);
			e.printStackTrace();
		}
	}
	/**
	 * 提交事物
	 * @param conn
	 */
	
	public static void commit(Connection conn){
		
		try {
			//提交事物
			conn.commit();
			//将事物的自动提交模式修改为真
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//将异常封装成自定义异常
			//throw new DaoExcetion("事物提交失败",e);
		}
	}
	
	/**
	 * 回滚事物
	 * @param conn
	 */
	public static void rollback(Connection conn){
		try {
			//回滚事物
			conn.rollback();
			//将事物的自动提交模式设为真
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//将异常封装成自定义异常
			//throw new DaoExcetion("事物回滚失败",e);
		}
	}
	/**
	 * 关闭连接
	 * @param conn
	 */
	public static void closeconnection(Connection conn){
		//如果数据库连接对象不为空，关闭该对象
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//将异常封装成自定义异常
				//throw new DaoExcetion("关闭连接对象失败",e);
			}
		}
	}
	
	/**
	 * 关闭statement
	 * @param rs
	 * @param stmt
	 */
	public static void closeStatement(ResultSet rs,Statement stmt){
		try {//如果查询结果集对象不为空，关闭该对象
		if(rs!=null){
				rs.close();
				//如果声明对象不为空，关闭该对象
				 if(stmt!=null){
					 stmt.close();
				 }
			}
		}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//将异常封装成自定义异常
				//throw new DaoException("关闭声明对象失败",e);
			}
	}
}