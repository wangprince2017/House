package com.swjd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.swjd.bean.House;
import com.swjd.service.HouseServiceImpl;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet(value="/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String xiaoQu = request.getParameter("xiaoQu");
		String huXing = request.getParameter("huXing");
		int price = Integer.parseInt(request.getParameter("zuJin"));
		String phone = request.getParameter("dianHua");
		String dizhi = request.getParameter("diZhi");
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("ids"));
		HouseServiceImpl houseServiceImpl = new HouseServiceImpl();
		House house = new House(xiaoQu,huXing,price,phone,dizhi);
		int jg = houseServiceImpl.update(house, id);
		if (jg>0) {
			out.print("<script>alert('修改成功');location.href='IndexServlet';</script>");
		}else {
			out.print("<script>alert('修改失败');location.href='IndexServlet';</script>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

