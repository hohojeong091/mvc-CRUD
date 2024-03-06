package com.ohgiraffers.mvc.book.controller;

import com.ohgiraffers.mvc.model.dto.BookDTO;
import com.ohgiraffers.mvc.model.service.LibBookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/book/list")
public class SelectAllBook extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LibBookService libBookService = new LibBookService();
        List<BookDTO> bookList = libBookService.selectAllBook();

        String path = " ";
        if(bookList != null && !bookList.isEmpty()) {
            path = "/WEB-INF/views/book/bookList.jsp";
            req.setAttribute("selectAllBook", bookList);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message", "책 정보 전체 조회에 실패했습니다. ");
        }

        req.getRequestDispatcher(path).forward(req, resp);
    }
}
