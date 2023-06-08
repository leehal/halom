package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bao.MemberDao;
import com.bto.MemberBo;


@WebServlet("/join.do")
public class joinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dis = request.getRequestDispatcher("join.jsp");
		dis.forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name =request.getParameter("name");
		String userid = request.getParameter("userid");
		String pwd =request.getParameter("pwd");
		String email =request.getParameter("email");
		String phone =request.getParameter("phone");
		String admin =request.getParameter("admin");
		
		MemberBo vo = new MemberBo();
		vo.setName(name);
		vo.setUserid(userid);
		vo.setPwd(pwd);
		vo.setEmail(email);
		vo.setPhone(phone);
		vo.setAdmin(Integer.parseInt(admin));

		MemberDao mDao = MemberDao.getInstance();
		int result =mDao.insertMember(vo);
		
		HttpSession session = request.getSession();
		if(result ==1) {
			session.setAttribute("userid", vo.getUserid());
			request.setAttribute("message", "회원가입 성공");
		}else {
			request.setAttribute("message", "회원가입 실패");
		}
		RequestDispatcher dis= request.getRequestDispatcher("login.jsp");
		dis.forward(request, response);
	}

}
