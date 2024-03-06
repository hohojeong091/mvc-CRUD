package com.ohgiraffers.mvc.model.dao;

import com.ohgiraffers.mvc.model.dto.BookDTO;

import java.util.List;

public interface BookMapper {
    BookDTO selectOneBook(String bookId);

    List<BookDTO> selectAllBook();

    int insertBook(BookDTO book);

    int updateBook(BookDTO bookDTO);

    int deleteBook(String bookId);

}
