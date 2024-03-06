package com.ohgiraffers.mvc.book.controller;

import com.ohgiraffers.mvc.model.service.LibBookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/book/delete")
public class BookDelete extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String bookId = req.getParameter("bookId");

        LibBookService libBookService = new LibBookService();
        int result = libBookService.deleteBook(bookId);

        if(result>0) {
            resp.sendRedirect(req.getContextPath()+ "/book/list");
        } else {
            req.setAttribute("message", "도서 정보 삭제에 실패하였습니다");
            req.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(req, resp);
        }


    }
}
