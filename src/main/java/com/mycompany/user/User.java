package com.mycompany.user;

import javax.persistence.*;

@SuppressWarnings("ALL")
@Entity
@Table(name = "users_test")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 45, nullable = false, name = "firstName")
    private String firstName;
    private String BookPrices;
    private String BookDescriptions;
    private String BookPages;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getBookPrices(){return BookPrices;}
    public void setBookPrices(String BookPrices){this.BookPrices = BookPrices;}

    public String getBookPages(){return BookPages;}
    public void  setBookPages(String BookPages){this.BookPages = BookPages;}

    public String getBookDescriptions(){return BookDescriptions;}
    public void setBookDescriptions(String BookDescriptions){this.BookDescriptions = BookDescriptions;}

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +

                ", BookName='" + getFirstName() + '\'' +
                ", BookPrices='" + getBookPrices() +'\'' +
                ", BookPages='" + getBookPages() +'\'' +
                ", BookDescriptions='" + getBookDescriptions() + '\'' +
                '}';
    }

}
