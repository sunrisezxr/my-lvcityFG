package com.lingnan.usersys.commom.util;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * ��ȡ���ݿ����ӣ��������ύ���ع�����ر����ӣ��ر�statement
 * @author Administrator
 *
 */
public class DBUtils {
	/**
	 * ��ȡ���ݿ�����
	 * @return
	 * @throws SQLException 
	 */

	public static Connection getconnection() throws SQLException{
		Connection conn=null;
		try {
			//��������
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:ORCL";
			String user="scott";
			String password="aBC123456";
			//������ݿ����Ӷ���
			conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			//���쳣��װ���Զ����쳣
			//throw new Daoexxeption("���ܽ������ݿ�����",e);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//���صõ������Ӷ���
		return conn;
	}
	/**
	 * ��������
	 * @param conn
	 */
	
	public  static void beginTransaction(Connection conn){
		try {
			//��������Զ��ύģʽ��Ϊ��
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//���쳣��װ���Զ����쳣
			//throw new DaoExection("���￪��ʧ��",e);
			e.printStackTrace();
		}
	}
	/**
	 * �ύ����
	 * @param conn
	 */
	
	public static void commit(Connection conn){
		
		try {
			//�ύ����
			conn.commit();
			//��������Զ��ύģʽ�޸�Ϊ��
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//���쳣��װ���Զ����쳣
			//throw new DaoExcetion("�����ύʧ��",e);
		}
	}
	
	/**
	 * �ع�����
	 * @param conn
	 */
	public static void rollback(Connection conn){
		try {
			//�ع�����
			conn.rollback();
			//��������Զ��ύģʽ��Ϊ��
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//���쳣��װ���Զ����쳣
			//throw new DaoExcetion("����ع�ʧ��",e);
		}
	}
	/**
	 * �ر�����
	 * @param conn
	 */
	public static void closeconnection(Connection conn){
		//������ݿ����Ӷ���Ϊ�գ��رոö���
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//���쳣��װ���Զ����쳣
				//throw new DaoExcetion("�ر����Ӷ���ʧ��",e);
			}
		}
	}
	
	/**
	 * �ر�statement
	 * @param rs
	 * @param stmt
	 */
	public static void closeStatement(ResultSet rs,Statement stmt){
		try {//�����ѯ���������Ϊ�գ��رոö���
		if(rs!=null){
				rs.close();
				//�����������Ϊ�գ��رոö���
				 if(stmt!=null){
					 stmt.close();
				 }
			}
		}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//���쳣��װ���Զ����쳣
				//throw new DaoException("�ر���������ʧ��",e);
			}
	}
}