package com.ohgiraffers.mvc.book.controller;

import com.ohgiraffers.mvc.model.dto.BookDTO;
import com.ohgiraffers.mvc.model.service.LibBookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/book/insert")
public class BookInsert extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        int bookId = Integer.parseInt(req.getParameter("bookId"));
        String bookName = req.getParameter("bookName");
        String autourName = req.getParameter("autourName");
        String pubName = req.getParameter("pubName");
        int catNum = Integer.parseInt(req.getParameter("catNum"));
        String ability = req.getParameter("ability");

        BookDTO book = new BookDTO();
        book.setBookId(bookId);
        book.setBookName(bookName);
        book.setAutourName(autourName);
        book.setPubName(pubName);
        book.setCatNum(catNum);
        book.setAbility(ability);

        LibBookService libBookService = new LibBookService();
        int result = libBookService.insertBook(book);

        if( result > 0) {
            resp.sendRedirect(req.getContextPath() + "/book/list");
        } else {
            req.setAttribute("message", "신규 도서 등록에 실패했습니다");
            req.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(req,resp);
        }


    }
}
