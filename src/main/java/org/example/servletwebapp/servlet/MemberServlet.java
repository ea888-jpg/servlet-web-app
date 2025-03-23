package org.example.servletwebapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.servletwebapp.models.Member;
import org.example.servletwebapp.service.MemberService;
import org.example.servletwebapp.service.impl.MemberServiceImpl;

import java.io.IOException;

@WebServlet(name = "memberServlet", value = "/member")
public class MemberServlet extends HttpServlet {
    private final MemberService memberService = new MemberServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        Member member = memberService.getMemberByName(name);
        request.setAttribute("member", member);
        request.getRequestDispatcher("/member.jsp").forward(request, response);
    }
}
