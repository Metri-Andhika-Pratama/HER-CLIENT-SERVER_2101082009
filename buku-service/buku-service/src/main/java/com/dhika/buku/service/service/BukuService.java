/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhika.buku.service.service;

import com.dhika.buku.service.entity.Buku;
import com.dhika.buku.service.repository.BukuRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Acer
 */
@Service
public class BukuService {
  @Autowired 
  private BukuRepository BukuRepository;
    
    public Buku saveBuku(Buku buku){
        return BukuRepository.save(buku);
    }
    
    public Buku findBukuById(Long bukuId){
        return BukuRepository.findByBukuId(bukuId);
    }
     public Buku findbukuById(Long bukuId){
        return BukuRepository.findByBukuId(bukuId);
    }
    public List<Buku> getAllBuku(){
        return BukuRepository.findAll();
    }
    public void deleteBukuId(Long bukuId){
        BukuRepository.deleteById(bukuId);
    }
    public Buku updateBuku(Buku buku){
        return BukuRepository.save(buku);
    }
}


    
  