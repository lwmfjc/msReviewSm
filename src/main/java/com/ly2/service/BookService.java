package com.ly2.service;

import com.ly2.entity.Book;
import com.ly2.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private BookMapper bookMapper;

    public BookService(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }
    public List<Book> getBooks(){
        return bookMapper.getBook();
    }
}
