package com.pb.stetsuk.hw5;

public class Reader {
    private String fio;
    private String bill;
    private String faculty;
    private String dateBirth;
    private String phone;

    public Reader(String fio, String bill,String faculty, String dateBirth, String phone) {
        this.fio = fio;
        this.bill = bill;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.phone = phone;
    }
    public String getFio() {
        return fio;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }
    public String getBill() {
        return bill;
    }
    public void setBill(String bill) {
        this.bill = bill;
    }
    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public String getDateBirth() {
        return dateBirth;
    }
    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void takeBook(int count) {
        System.out.println("Читатель " + getFio() + " взял " + count + " книг");
    }
    public void takeBook(String... books) {
        System.out.println(this.fio + " взял следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }
    public void takeBook(Book... books) {
        System.out.println(this.fio + " взял следующие книги:");
        for (Book book : books) {
            System.out.println(book.getName() + ", автор: " + book.getAuthor() + ", год: " + book.getYear());
        }
        System.out.println();
    }
    public void returnBook(int number) {
        System.out.println(this.fio + " вернул " + number + " книги.");
    }

    public void returnBook(String... books) {
        System.out.println(this.fio + " вернул следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(this.fio + " вернул следующие книги:");
        for (Book book : books) {
            System.out.println(book.getName() + ", автор - " + book.getAuthor() + ", год: " + book.getYear());
        }
        System.out.println();
    }

    public String getInfo() {
        return "фамилия " + fio + ", билет№ " + bill + ", факультет " + faculty  + ", дата рождения " + dateBirth + ", телефон " + phone;
    }
}


