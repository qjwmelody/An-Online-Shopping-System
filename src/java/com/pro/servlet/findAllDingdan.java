package com.pro.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pro.biz.DingdanBiz;
import com.pro.biz.DingdanBizImpl;
import com.pro.entity.Dingdan;

@WebServlet("/findAllDingdan")
public class findAllDingdan extends HttpServlet {
	/*@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try {
		List<Dingdan> list;
		String page = req.getParameter("page");
		System.out.println("页数为" + page);
		DingdanBiz dingdanBiz = new DingdanBizImpl();
		int pages = dingdanBiz.DingdanPages(5);
	
			if (page == null||Integer.valueOf(page)<=0||Integer.valueOf(page)>pages) {
				page = "1";
				list = dingdanBiz.findAllDingdan(Integer.valueOf(page), 5);
			} else {
				list = dingdanBiz.findAllDingdan(Integer.valueOf(page), 5);
			}
			req.setAttribute("list", list);
			req.setAttribute("page", pages);
                        
			req.getRequestDispatcher("dingdan.jsp?rowid=1").forward(req, resp);

		} catch (Exception e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}*/
}
