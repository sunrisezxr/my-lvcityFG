package com.neuedu.lvcity.model;
/**
 * banner实体类
 * @author Administrator
 *
 */
public class Banner {
	private int banarid;           //广告ID
	private String image;          //图片
	private int state;             //广告的状态
	
	/**
	 * 构造方法
	 */
	public Banner(){
		super();
	}
	/**
	 * 带参数的构造方法
	 * @param banarid
	 * @param image
	 * @param state
	 */
	public Banner(int banarid,String image,int state){
		super();
		this.banarid=banarid;
		this.image=image;
		this.state=state;
	}


	
	/**
	 * 取得广告id
	 * @return
	 */
	public int getBanarid() {
		return banarid;
	}
	/**
	 * 设置指定的值给广告ID编号
	 * @param banarid  广告ID编号参数
	 */
	public void setBanarid(int banarid) {
		this.banarid = banarid;
	}
	/**
	 * 取得图片
	 * @return 返回图片
	 */
	public String getImage() {
		return image;
	}
	/**
	 * 设定指定的图片
	 * @param image  图片参数
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * 取得广告的状态
	 * @return  返回广告的状态
	 */
	public int getState() {
		return state;
	}
	/**
	 * 设置指定的广告状态
	 * @param state  广告状态参数
	 */
	public void setState(int state) {
		this.state = state;
	}
	

}
