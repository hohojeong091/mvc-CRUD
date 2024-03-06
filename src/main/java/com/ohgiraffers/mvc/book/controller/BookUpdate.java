package com.ohgiraffers.mvc.book.controller;

import com.ohgiraffers.mvc.model.dto.BookDTO;
import com.ohgiraffers.mvc.model.service.LibBookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/book/update")
public class BookUpdate extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        int bookId = Integer.parseInt(req.getParameter("bookId"));
        String bookName = req.getParameter("bookName");
        String autourName = req.getParameter("autourName");
        System.out.println(autourName);

        BookDTO bookDTO = new BookDTO();
        bookDTO.setBookId(bookId);
        bookDTO.setBookName(bookName);
        bookDTO.setAutourName(autourName);

        LibBookService libBookService = new LibBookService();
        int result = libBookService.updateBook(bookDTO);
        System.out.println(result);

        if(result>0 ) {
            resp.sendRedirect(req.getContextPath() + "/lib/select?rentBook="+bookId);
        } else {
            req.setAttribute("message", " 책 정보 수정에 실패하였습니다.");
            req.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(req, resp);
        }


    }
}
