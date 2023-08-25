package com.kh.java.day0803;

import java.io.*;

public class Book implements Serializable {
	
    private String title;
    private int price;
    

    public Book() {
    }
    

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = title;
    }

    public int getKcal() {
        return price;
    }

    public void setKcal(int kcal) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public void fileSave(String fileName) {
        try {
            File file = new File(fileName);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

       
           Book food = new Book("정석", 20000);

        
            objectOutputStream.writeObject(food);

         
            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Book 객체를 파일에 저장하였습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Book food = new Book();
        food.fileSave("Book.txt");
    }
}


