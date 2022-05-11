package com.swjd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.swjd.bean.House;
import com.swjd.service.HouseServiceImpl;

/**
 * Servlet implementation class IndexServlet2
 */
@WebServlet(value="/IndexServlet2")
public class IndexServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String name = request.getParameter("xiaoQuName");
		String huXing= request.getParameter("huXing");
		HouseServiceImpl houseServiceImpl = new HouseServiceImpl();
		List<House> list = houseServiceImpl.selectMoHuByName(name, huXing);
		request.setAttribute("list", list);
		request.setAttribute("name", name);
		request.setAttribute("huXing", huXing);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

