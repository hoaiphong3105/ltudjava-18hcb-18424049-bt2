package pojo;
// Generated Aug 24, 2019 4:40:57 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * LichPhucKhao generated by hbm2java
 */
public class LichPhucKhao  implements java.io.Serializable {


     private int id;
     private String maMonHoc;
     private Date tgBatDau;
     private Date tgKetThuc;

    public LichPhucKhao() {
    }

    public LichPhucKhao(int id, String maMonHoc, Date tgBatDau, Date tgKetThuc) {
       this.id = id;
       this.maMonHoc = maMonHoc;
       this.tgBatDau = tgBatDau;
       this.tgKetThuc = tgKetThuc;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getMaMonHoc() {
        return this.maMonHoc;
    }
    
    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }
    public Date getTgBatDau() {
        return this.tgBatDau;
    }
    
    public void setTgBatDau(Date tgBatDau) {
        this.tgBatDau = tgBatDau;
    }
    public Date getTgKetThuc() {
        return this.tgKetThuc;
    }
    
    public void setTgKetThuc(Date tgKetThuc) {
        this.tgKetThuc = tgKetThuc;
    }




}

