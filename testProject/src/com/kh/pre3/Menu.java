package com.kh.pre3;

public class Menu {
    // 필드(데이터 집합)
    private String menuName;
    private int price;
    private int stock;

    // 생성자
    public Menu(String menuName, int price, int stock) {
        this.menuName = menuName;
        this.price = price;
        this.stock = stock;
    }

    // 메서드(기능 집합)

    // 메뉴 정보 출력
    public void printMenuInfo() {
        System.out.println("메뉴명: " + menuName);
        System.out.println("가격: " + price + "원");
        System.out.println("재고량: " + stock);
    }

    // 메뉴 주문 시 재고량 수정
    public void updateStock(int quantity) {
        if (stock >= quantity) {
            stock -= quantity;
            System.out.println(menuName + " " + quantity + "개 주문 완료!"+quantity*price+"원입니다.");
        } else {
            System.out.println(menuName + " 메뉴 재고가 부족합니다.");
        }
    }

    // getter 메서드 - 메뉴명 가져오기
    public String getMenuName() {
        return menuName;
    }

    // getter 메서드 - 가격 가져오기
    public int getPrice() {
        return price;
    }

    // getter 메서드 - 재고량 가져오기
    public int getStock() {
        return stock;
    }

    // setter 메서드 - 가격 수정하기
    public void setPrice(int price) {
        this.price = price;
    }

    // setter 메서드 - 재고량 수정하기
    public void setStock(int stock) {
        this.stock = stock;
    }
}
//팝콘(1.일반1000 2.카라멜1000 3.반반1000 4.선택안함0),
//음료(1.콜라1000 2.사이다1000 3.쥬스1000 4.선택안함0),
//사이드메뉴(1.오징어1000 ,2.쥐포1000 ,3.츄러스 4.선택안함 )

