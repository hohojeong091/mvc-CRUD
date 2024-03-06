package com.ohgiraffers.mvc.model.service;

import com.ohgiraffers.mvc.model.dao.BookMapper;
import com.ohgiraffers.mvc.model.dto.BookDTO;
import org.apache.ibatis.session.SqlSession;

import java.awt.print.Book;
import java.util.List;

import static com.ohgiraffers.mvc.common.mybatis.Template.getSqlSession;

public class LibBookService {
    private BookMapper bookMapper;

    public List<BookDTO> selectAllBook() {
        SqlSession sqlSession = getSqlSession();
        bookMapper = sqlSession.getMapper(BookMapper.class);
        List<BookDTO> bookList = bookMapper.selectAllBook();
        sqlSession.close();
        return bookList;
    }

    public BookDTO selectOnebook(String bookId) {
        SqlSession sqlsession = getSqlSession();
        bookMapper = sqlsession.getMapper(BookMapper.class);
        BookDTO selectOneBook = bookMapper.selectOneBook(bookId);

        sqlsession.close();
        return selectOneBook;
    }

    public int insertBook(BookDTO book) {
        SqlSession sqlSession = getSqlSession();
        bookMapper = sqlSession.getMapper(BookMapper.class);

        int result = bookMapper.insertBook(book);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result;


    }

    public int updateBook(BookDTO bookDTO) {
        SqlSession sqlSession = getSqlSession();
        bookMapper = sqlSession.getMapper(BookMapper.class);

        int result = bookMapper.updateBook(bookDTO);

        if (result>0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result ;


    }

    public int deleteBook(String bookId) {
        SqlSession sqlSession = getSqlSession();
        bookMapper = sqlSession.getMapper(BookMapper.class);

        int result = bookMapper.deleteBook(bookId);

        if (result > 0 ) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        } sqlSession.close();
        return result ;
    }
}
