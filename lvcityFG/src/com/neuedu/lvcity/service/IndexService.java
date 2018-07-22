package com.neuedu.lvcity.service;

import java.util.List;

import com.neuedu.lvcity.model.Article;
import com.neuedu.lvcity.model.Banner;
import com.neuedu.lvcity.model.Food;
import com.neuedu.lvcity.model.Scenic;
/**
 * 广告service接口
 * @author Administrator
 *
 */
public interface IndexService {
	/**
	 * 查找广告
	 * @return 返回广告
	 */
	public List<Banner> findBanner();
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
