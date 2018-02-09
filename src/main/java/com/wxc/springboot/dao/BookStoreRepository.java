package com.wxc.springboot.dao;

import com.wxc.springboot.entity.BookStore;
import org.hibernate.annotations.Persister;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookStoreRepository extends JpaRepository<BookStore,Integer> {


}
