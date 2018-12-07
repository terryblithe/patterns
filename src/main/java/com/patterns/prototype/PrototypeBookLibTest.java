package com.patterns.prototype;

import java.util.List;

/**
 * 原型模式：（深拷贝）测试
 */
public class PrototypeBookLibTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Book b1 = new Book("Java编译原理", "Y0001");
        Book b2 = new Book("高性能MySQL", "Y0002");

        BookLib bookLib = new BookLib("国家图书管", "Beijing");
        List<Book> books = bookLib.getBooks();
        books.add(b1);
        books.add(b2);

        System.out.println(bookLib);

        System.out.println("=====================================");

        //深拷贝
        BookLib clone = (BookLib) bookLib.clone();
        List<Book> cloneBooks = clone.getBooks();

        Book b3 = new Book("Python编程快速上手", "Y0003");
        cloneBooks.add(b3);

        System.out.println(bookLib);
        System.out.println(clone);

    }

}
