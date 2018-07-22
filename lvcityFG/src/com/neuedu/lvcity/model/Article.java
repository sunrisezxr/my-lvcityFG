package com.neuedu.lvcity.model;

import java.sql.Date;
/**
 * article实体类
 * @author Administrator
 *
 */
public class Article {
	  int aid;                  //首页文章ID序号
	  int atid;                 //首页文章ID编号
	  int publisher ;           //文章作者
	  Date releasetime = null;  //文章发布时间
	  String content = null;    //文章内容
	  String image = null;      //图片
	  String articlename = null;//文章名字
	  /*
	   * 构造方法
	   */
	  public Article(){
		  
	  }
	  
	  /**
	   * 取得文章ID序号
	   * @return  返回文章ID序号
	   */
	public int getAid() {
		return aid;
	}
	/**
	 * 设置指定的值给文章ID
	 * @param aid  文章ID参数
	 */
	public void setAid(int aid) {
		this.aid = aid;
	}
	/**
	 * 取得文章ID编号
	 * @return  返回文章ID编号
	 */
	public int getAtid() {
		return atid;
	}
	 /**
	  * 设置指定的值给文章ID编号
	  * @param atid  文章ID编号参数
	  */
	public void setAtid(int atid) {
		this.atid = atid;
	}
	/**
	 * 取得文章作者
	 * @return 返回文章作者
	 */
	public int getPublisher() {
		return publisher;
	}
	/**
	 * 设置指定值给文章作者
	 * @param publisher  文章作者参数
	 */
	public void setPublisher(int publisher) {
		this.publisher = publisher;
	}
	/**
	 * 取得文章发布时间
	 * @return  返回文章发布时间
	 */
	public Date getReleasetime() {
		return releasetime;
	}
	/**
	 * 设置设定的时间给文章发布时间
	 * @param releasetime  文章发布时间参数
	 */
	public void setReleasetime(Date releasetime) {
		this.releasetime = releasetime;
	}
	/**
	 * 取得文章内容
	 * @return  返回文章内容
 	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置指定的内容给文章内容
	 * @param content  文章内容餐参数
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 取得图片
	 * @return 返回图片
	 */
	public String getImage() {
		return image;
	} 
	/**
	 *  设置指定的图片
	 * @param image  图片参数
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * 取得文章名字
	 * @return  返回文章名字
	 */
	public String getArticlename() {
		return articlename;
	}
	/**
	 * 设置指定的文章名字
	 * @param articlename  文章名字参数
	 */
	public void setArticlename(String articlename) {
		this.articlename = articlename;
	}

}
