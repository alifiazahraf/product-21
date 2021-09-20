package io.vutura.p21.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PROGRESS")
public class Progress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "module_name")
    private String moduleName;
    @Column(name = "module_clear")
    private Date moduleClear = new Date(System.currentTimeMillis());

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Date getModuleClear() {
        return moduleClear;
    }

    public void setModuleClear(Date moduleClear) {
        this.moduleClear = moduleClear;
    }
}
