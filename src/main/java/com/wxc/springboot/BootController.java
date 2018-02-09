package com.wxc.springboot;


import com.wxc.entity.User;
import com.wxc.entity.properties.CarProperties;
import com.wxc.springboot.entity.BookStore;
import com.wxc.springboot.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BootController {

    @Value("${cupSize}")
    private String cupSize;

    @Autowired
    private com.wxc.springboot.CarProperties CarProperties;//此类必须和控制器类放同一目录，不然找不到。

    @RequestMapping("/boot")
    public String getBoot() {

        return "Boot......" + cupSize + CarProperties.getName();
    }

    @RequestMapping("/boot2/{ids}")
    public String getBoorParams(@PathVariable("ids") int ids) {
//http://localhost:8080/springboot/boot2/5666
        return "" + ids;
    }

    @RequestMapping("/{ids}/boot3")
    public String getBoorParams3(@PathVariable("ids") int ids) {
//http://localhost:8080/springboot/5666/boot3
        return "" + ids;
    }


    @RequestMapping("/boot4")
    public String getBoorParams4(@RequestParam("ids") int ids) {
//http://localhost:8080/springboot/boot4?ids=5666
        return "" + ids;
    }


    @RequestMapping("/boot5")
    public String getBoorParams5(@RequestParam(value = "ids", defaultValue = "1000", required = false) int ids) {
//http://localhost:8080/springboot/boot5?ids=
        return "" + ids;
    }


    @Autowired
    BookStoreService bookStoreService;

    //数据库操作
    @GetMapping("/getAllUser")
    public List<BookStore> getAllUser() {
        return bookStoreService.findAllBookStore();
    }


    @PostMapping("/getBookStore")
    public BookStore getBookStore( @RequestParam("id") Integer id){

        return bookStoreService.findBookStoreById(id);

    }


    @PostMapping("/save2BookStore")
    public void save2BookStore(){

        bookStoreService.saveBooStores();

    }



}
