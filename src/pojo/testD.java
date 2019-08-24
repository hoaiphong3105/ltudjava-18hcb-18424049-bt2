/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author hoaip
 */
public class testD {
    private int id;
    private String ho_ten;

    public testD(int id, String ho_ten) {
        this.id = id;
        this.ho_ten = ho_ten;
    }
    
    public testD() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }
}
