package com.neuedu.lvcity.model;
/**
 * scenic实体类
 * @author Administrator
 *
 */
public class Scenic {
	  int sid;              //风景图片序号
	  int stid;             //风景图片ID编号
	  String sname = null;  //风景图片名字
	  String image = null;  //风景图片
	  int aid;              
	  String lx = null;     //图片类别
	  
	  //不带参数的构造方法
	  /**
	   * 不带参数的构造方法
	   */
	  public Scenic(){
		  super();
	  }
	  /**
	   * 取得sid
	   * @return  返回sid
	   */
	public int getSid() {
		return sid;
	}
	/**
	 * 设置指定的sid
	 * @param sid  sid参数
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}
	/**
	 * 取得stid
	 * @return  返回stid
	 */
	public int getStid() {
		return stid;
	}
	/**
	 * 设置指定的stid
	 * @param stid  stid参数
	 */
	public void setStid(int stid) {
		this.stid = stid;
	}
	/**
	 * 取得sname
	 * @return  返回sname
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * 设置指定的sname
	 * @param sname  sname参数
	 */ 
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * 取得image
	 * @return  返回image
	 */
	public String getImage() {
		return image;
	}
	/**
	 * 设置指定的image
	 * @param image  image参数
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * 取得aid
	 * @return  返回aid
	 */
	public int getAid() {
		return aid;
	}
	/**
	 * 设置指定的aid
	 * @param aid  aid参数
	 */
	public void setAid(int aid) {
		this.aid = aid;
	}
	/**
	 * 取得lx
	 * @return  返回lx
	 */
	public String getLx() {
		return lx;
	}
	/**
	 * 设置指定的lx
	 * @param lx   lx参数
	 */
	public void setLx(String lx) {
		this.lx = lx;
	}

}
