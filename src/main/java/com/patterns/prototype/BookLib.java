package com.patterns.prototype;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式（深拷贝）：
 */
public class BookLib implements Serializable {

    private String name;
    private String address;
    private List<Book> books;

    public BookLib(String name, String address) {
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    /**
     * 深拷贝，通过序列化来实现
     * @return
     */
    @Override
    public Object clone() throws CloneNotSupportedException {

        Object obj = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);
            obj = ois.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return obj;
    }

    @Override
    public String toString() {
        return "BookLib{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", books=" + books +
                '}';
    }
}
