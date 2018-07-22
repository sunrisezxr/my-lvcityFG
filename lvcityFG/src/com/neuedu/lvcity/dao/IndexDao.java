
package com.neuedu.lvcity.dao;

import java.util.List;

import com.neuedu.lvcity.model.Article;
import com.neuedu.lvcity.model.Banner;
import com.neuedu.lvcity.model.Food;
import com.neuedu.lvcity.model.Scenic;


/**
 * 首页Dao接口
 * @author Administrator
 *
 */
public interface IndexDao{
	/**
	 * 查找广告大图
	 * @return  返回广告图片
	 */
	public List<Banner> findBanner();  //广告大图
	/**
	 * 查找首页文章
	 * @return 返回首页文章
	 */
	public List<Article> findIndexArticle(); //首页文章
	/**
	 * 查找首页风景图片
	 * @return 返回首页风景图片
	 */
	public List<Scenic> findIndexScenic(); //首页风景图片
	/**
	 * 查找首页美食图片
	 * @return 返回首页美食图片
	 */
	public List<Food> findIndexFood(); //首页美食图片
	
}