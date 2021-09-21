package io.vutura.p21.model;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "VOUCHER")
public class Voucher {

    @Id
    @NotNull
    @Column(name = "voucher")
    private String voucher;

    @NotNull
    @Column(name = "type")
    private String type;

    @NotNull
    @Column(name = "stock")
    private int stock;

    @NotNull
    @Column(name = "amount")
    private String amount;

    @Column(name = "created_date")
    private Date createdDate = new Date(System.currentTimeMillis());

    @Column(name = "expire_date")
    private Date expireDate;

    @NotNull
    @Column(name = "status")
    private String status;

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "voucher='" + voucher + '\'' +
                ", type='" + type + '\'' +
                ", stock=" + stock +
                ", amount='" + amount + '\'' +
                ", createdDate=" + createdDate +
                ", expireDate=" + expireDate +
                ", status='" + status + '\'' +
                '}';
    }
}
