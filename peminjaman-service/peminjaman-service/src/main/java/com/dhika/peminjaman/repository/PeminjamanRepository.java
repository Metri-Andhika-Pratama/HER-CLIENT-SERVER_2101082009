/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dhika.peminjaman.repository;

import com.dhika.peminjaman.VO.ResponseTemplateVO;
import com.dhika.peminjaman.entity.Peminjaman;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Acer
 */
@Repository
public interface PeminjamanRepository extends JpaRepository<Peminjaman, Long> {
    public Peminjaman findByPeminjamanId(Long peminjamanId);
}