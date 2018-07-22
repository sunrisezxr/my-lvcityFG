package com.neuedu.lvcity.dao.impl;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

import com.neuedu.lvcity.common.DBUtils;
import com.neuedu.lvcity.dao.IndexDao;
import com.neuedu.lvcity.model.Article;
import com.neuedu.lvcity.model.Banner;
import com.neuedu.lvcity.model.Food;
import com.neuedu.lvcity.model.Scenic;
/**
 * 首页Dao实现类
 * @author Administrator
 *
 */
public class IndexDaoImpl implements IndexDao {
	/**
	 * 数据库连接
	 */
	private Connection conn;
	/**
	 * 构造方法
	 * @param conn2   数据库连接
	 */
	
	public IndexDaoImpl(Connection conn){
		//给属性赋初始化值
		this.conn=conn;
	}

	/**
	 *  查找首页大图
	 */
	public List<Banner> findBanner(){
		List<Banner> list = new ArrayList<Banner>();
		
		Statement st = null;
		ResultSet rs = null;
		String sql="select * from banar";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				Banner b = new Banner();
				b.setBanarid(rs.getInt("banarid"));
				b.setImage(rs.getString("image"));
				b.setState(rs.getInt("state"));
				list.add(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			DBUtils.closeStatement(rs, st);
		}
			return list;
	}

	//首页文章
	/**
	 * 查找首页文章
	 */
	public List<Article> findIndexArticle(){
		List<Article> list = new ArrayList<Article>();
		
		java.sql.Statement st = null;
		ResultSet rs = null;
		String sql="select aid,content,image,articlename from article where atid=1 ORDER BY aid desc limit 3";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				Article a = new Article();
				a.setAid(rs.getInt("aid"));
				a.setArticlename(rs.getString("articlname"));
				a.setAtid(rs.getInt("atid"));
				a.setContent(rs.getString("content"));
				a.setImage(rs.getString("image"));
				a.setPublisher(rs.getInt("publisher"));
				a.setReleasetime(rs.getDate("releasetime"));
				list.add(a);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			DBUtils.closeStatement(rs, st);
		}
			return list;
	}
	//首页美食图片
	/**
	 * 查找首页美食
	 */

	public List<Food> findIndexFood(){
		List<Food> list = new ArrayList<Food>();
		
		java.sql.Statement st = null;
		ResultSet rs = null;
		//select fid,fname,aid,image from  food order by fid desc limit 6
		String sql="select * from  food order by fid desc limit 6";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				  Food f = new Food();
				  f.setAid(rs.getInt("aid"));
				  f.setFid(rs.getInt("fid"));
				  f.setFname(rs.getString("fname"));
				  f.setFtid(rs.getInt("ftid"));
				  f.setImage(rs.getString("image"));
				 list.add(f);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			DBUtils.closeStatement(rs, st);
		}
			return list;
	}
	//首页风景图片
	/**
	 * 查找首页风景图片
	 */
	public List<Scenic> findIndexScenic(){
		 
		  List<Scenic> list = new ArrayList<Scenic>();
		
			java.sql.Statement st = null;
			ResultSet rs = null;
			//  SELECT * FROM scenic WHERE sid>ROUND((RAND()*(SELECT MAX(sid) FROM scenic where lx='景点'))-3.5,0) LIMIT 7
			String sql="select * from scenic where lx='景点' LIMIT 7";
			try {
				st = conn.createStatement();
				rs = st.executeQuery(sql);
				while(rs.next()){	
					Scenic s=new Scenic();
					  s.setSid(rs.getInt("sid"));
					  s.setStid(rs.getInt("stid"));
					  s.setSname(rs.getString("sname"));
					  s.setImage(rs.getString("image"));
					  s.setAid(rs.getInt("aid"));
					  s.setLx(rs.getString("lx"));
					  list.add(s);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				DBUtils.closeStatement(rs, st);
			}
				return list;
		}
}
