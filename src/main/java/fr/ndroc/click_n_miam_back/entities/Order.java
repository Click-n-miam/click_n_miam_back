package fr.ndroc.click_n_miam_back.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String reference;
    private String email;
    private Date datetime_order;
    private Float price;
    private String pay_method;
    private Boolean paid;

    public Order() {
    }

    public Order(Integer id, String reference, String email, Date datetime_order, Float price, String pay_method, Boolean paid) {
        this.id = id;
        this.reference = reference;
        this.email = email;
        this.datetime_order = datetime_order;
        this.price = price;
        this.pay_method = pay_method;
        this.paid = paid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDatetime_order() {
        return datetime_order;
    }

    public void setDatetime_order(Date datetime_order) {
        this.datetime_order = datetime_order;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getPay_method() {
        return pay_method;
    }

    public void setPay_method(String pay_method) {
        this.pay_method = pay_method;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", reference='" + reference + '\'' +
                ", email='" + email + '\'' +
                ", datetime_order=" + datetime_order +
                ", price=" + price +
                ", pay_method='" + pay_method + '\'' +
                ", paid=" + paid +
                '}';
    }
}
