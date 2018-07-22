package com.neuedu.lvcity.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neuedu.lvcity.model.Article;
import com.neuedu.lvcity.model.Banner;
import com.neuedu.lvcity.model.Food;
import com.neuedu.lvcity.model.Scenic;
import com.neuedu.lvcity.service.IndexService;
import com.neuedu.lvcity.service.impl.IndexServiceImpl;


/**
 * 首页实体servlet层
 * @author Administrator
 *
 */
public class IndexServlet extends HttpServlet{
	
	public IndexServlet(){
		super();	
	}
	/**
	 * doGet方法
	 */
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			{
		// TODO Auto-generated method stub
		try {
			resp.getWriter().append("Served at:").append(req.getContextPath());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		try {
			doPost(req,resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * doPost方法
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession se=req.getSession();
		
		IndexService indexService =IndexServiceImpl.getInstance();
		List<Banner> banarList=indexService.findBanner(); 
		se.setAttribute("banarList", banarList);
		
		List<Article> articleList=indexService.findIndexArticle();
		se.setAttribute("articleList", articleList);
		
		List<Scenic> scenicList=indexService.findIndexScenic();
		se.setAttribute("scenicList", scenicList);
		
		List<Food> foodList=indexService.findIndexFood();				
		se.setAttribute("foodList", foodList);
		
		resp.sendRedirect(req.getContextPath()+"/User/index.jsp");
	}


}
