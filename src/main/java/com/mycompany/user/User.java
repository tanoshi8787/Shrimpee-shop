package com.mycompany.user;

import javax.persistence.*;

@SuppressWarnings("ALL")
@Entity
@Table(name = "users_test")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 45, nullable = false, name = "ProductName")
    private String ProductName;
    private String ProductPrice;
    private String ProductDate;
    private String Location;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return ProductName;
    }
    public void setProductName(String firstName) {
        this.ProductName = firstName;
    }

    public String getProductPrice(){return ProductPrice;}
    public void setProductPrice(String Prices){this.ProductPrice = Prices;}

    public String getLocation(){return Location;}
    public void setLocation(String Loc){this.Location = Loc;}

    public String getProductDate(){return ProductDate;}
    public void setProductDate(String Date){this.ProductDate = Date;}

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +

                ", ProductName='" + getProductName() + '\'' +
                ", ProductPrice='" + getProductPrice() +'\'' +
                ", Location='" + getLocation() +'\'' +
                ", BookDescriptions='" + getProductDate() + '\'' +
                '}';
    }

}
