/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhika.client_2101082009.model;

/**
 *
 * @author Acer
 */
public class Pengembalian {
    private Long pengembalianId;
    private Long peminjamanId;
    private String tglDikembalikan;
    private int terlambat;
    private double denda;

    public Pengembalian() {
    }
    
    
    public Pengembalian(Long pengembalianId, Long peminjamanId, String tglDikembalikan, int terlambat, double denda) {
        this.pengembalianId = pengembalianId;
        this.peminjamanId = peminjamanId;
        this.tglDikembalikan = tglDikembalikan;
        this.terlambat = terlambat;
        this.denda = denda;
    }
    
    
    
    public Long getPengembalianId() {
        return pengembalianId;
    }

    public void setPengembalianId(Long pengembalianId) {
        this.pengembalianId = pengembalianId;
    }

    public Long getPeminjamanId() {
        return peminjamanId;
    }

    public void setPeminjamanId(Long peminjamanId) {
        this.peminjamanId = peminjamanId;
    }

    public String getTglDikembalikan() {
        return tglDikembalikan;
    }

    public void setTglDikembalikan(String tglDikembalikan) {
        this.tglDikembalikan = tglDikembalikan;
    }

    public int getTerlambat() {
        return terlambat;
    }

    public void setTerlambat(int terlambat) {
        this.terlambat = terlambat;
    }

    public double getDenda() {
        return denda;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }

    
    
    
}
