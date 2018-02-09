package com.wxc.springboot.service;

import com.wxc.springboot.dao.BookStoreRepository;
import com.wxc.springboot.entity.BookStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.beans.Transient;
import java.util.List;

@Service
public class BookStoreService {
    @Autowired
    BookStoreRepository bookStoreRepository;

    public List<BookStore> findAllBookStore(){

        return bookStoreRepository.findAll();

    }

    public BookStore findBookStoreById(Integer id){
        return bookStoreRepository.findOne(id);
    }


    @Transactional
    public void saveBooStores(){
        BookStore bs1=new BookStore();
        bs1.setAddress("dayang");
        bs1.setStoreName("jljldkjla");

        bookStoreRepository.save(bs1);
        System.out.println("bs1  id:"+bs1.getId());

        BookStore bs2=bs1;
        bs2.setAddress("yyyyyyy");
        bs2.setStoreName("GGGGGGG");
        bookStoreRepository.save(bs2);
        System.out.println("bs2  id:"+bs2.getId());
    }
}
