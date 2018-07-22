package com.neuedu.lvcity.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

import com.neuedu.lvcity.common.DBUtils;
import com.neuedu.lvcity.dao.impl.IndexDaoImpl;
import com.neuedu.lvcity.model.Article;
import com.neuedu.lvcity.model.Banner;
import com.neuedu.lvcity.model.Food;
import com.neuedu.lvcity.model.Scenic;
import com.neuedu.lvcity.service.IndexService;


/**
 * 首页service接口实现类
 * @author Administrator
 *
 */
public class IndexServiceImpl implements IndexService {
	/**
	 *  首页service类实例，在类的内部创建单例模式的唯一的实例
	 */
	public static IndexService bannerservice = new IndexServiceImpl();
	/**
	 * 构造方法
	 */
	private IndexServiceImpl(){
		
	}
	/**
	 * 取得首页service的实例。提供一个公共的访问接口给外部调用
	 * @return  返回用户service实例
	 */
	public static IndexService getInstance(){
		return bannerservice;
	}
	/**
	 * 查找首页大图
	 */
	public List<Banner> findBanner(){
		Connection conn = null;
		List<Banner> list = new ArrayList<Banner>();
		try{
		conn = DBUtils.getConnection();
		IndexDaoImpl id = new IndexDaoImpl(conn);
		list = id.findBanner();
		
	}
		catch (Exception e) {
			// TODO: handle exception
		}finally{
			DBUtils.closeConnection(conn);
		}
		return list;

		
	}
	/**
	 * 查找首页文章
	 */
	public List<Article> findIndexArticle(){
		Connection conn = null;
		conn = DBUtils.getConnection();
		IndexDaoImpl id = new IndexDaoImpl(conn);
		List<Article> list = new ArrayList<Article>();
		list = id.findIndexArticle();
		return list;
		
	}
	/**
	 * 查找首页风景
	 */
	public List<Scenic> findIndexScenic(){
		Connection conn = null;
		conn = DBUtils.getConnection();
		IndexDaoImpl id = new IndexDaoImpl(conn);
		List<Scenic> list = new ArrayList<Scenic>();
		list = id.findIndexScenic();
		return list;
		
	}
	/**
	 * 查找首页美食图片
	 */
	public List<Food> findIndexFood(){
		Connection conn = null;
		conn = DBUtils.getConnection();
		IndexDaoImpl id = new IndexDaoImpl(conn);
		List<Food> list = new ArrayList<Food>();
		list = id.findIndexFood();
		return list;
		
	}
	

}
