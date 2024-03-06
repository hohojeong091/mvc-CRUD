package com.ohgiraffers.mvc.book.controller;

import com.ohgiraffers.mvc.model.dto.BookDTO;
import com.ohgiraffers.mvc.model.service.LibBookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/lib/select")
public class SelectOneBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String bookId = req.getParameter("rentBook");

        LibBookService libBookService = new LibBookService ();
        BookDTO selectOneBook = libBookService.selectOnebook(bookId);

        String path = " ";
        if(selectOneBook != null) {
            path = "/WEB-INF/views/book/showBookInfo.jsp";
            req.setAttribute("selectOneBook", selectOneBook);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message", "해당 번호로 책을 조회할 수 없습니다. ");
        } req.getRequestDispatcher(path).forward(req, resp);


    }
}
