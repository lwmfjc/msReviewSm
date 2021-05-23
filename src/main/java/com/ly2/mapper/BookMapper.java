package com.ly2.mapper;

import com.ly2.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
public interface BookMapper {
    @Select("select * from book")
    List<Book> getBook();
}
