package com.neuedu.lvcity.model;
/**
 * food实体类
 * @author Administrator
 *
 */
public class Food {	  
	  int fid;              //美食图片序号
	  int ftid;             //美食图片ID编号
	  String fname = null;  //美食图片名字
	  String image = null;  //美食图片
	  int aid;
	  /**
	   * 不带参数构造方法
	   */
	  public Food(){
		  super();		  
	  }
	  /**
	   * 带参数构造方法
	   * @param fid    参数fid
	   * @param ftid   参数ftid
	   * @param fname  参数fname
	   * @param image  参数image
	   * @param aid    参数aid
	   */
	  public Food(int fid,int ftid,String fname,String image,int aid){
		  super();
		  this.fid=fid;
		  this.ftid=ftid;
		  this.fname=fname;
		  this.image=image;
		  this.aid=aid;
		  
	  }
	  /**
	   * 取得fid
	   * @return  返回fid
	   */
	public int getFid() {
		return fid;
	}
	/**
	 * 设置指定的fid
	 * @param fid  fid参数
	 */
	public void setFid(int fid) {
		this.fid = fid;
	}
	/**
	 * 取得ftid
	 * @return  返回ftid
	 */
	public int getFtid() {
		return ftid;
	}
	/**
	 * 设置指定的ftid
	 * @param ftid  ftid参数
	 */
	public void setFtid(int ftid) {
		this.ftid = ftid;
	}
	/**
	 * 取得fname
	 * @return  返回fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 * 设置指定的fname
	 * @param fname  fname参数
	 */
	public void setFname(String fname) {
		this.fname = fname;
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
	 *  设置指定的aid
	 * @param aid  aid参数
	 */
	public void setAid(int aid) {
		this.aid = aid;
	}

}
