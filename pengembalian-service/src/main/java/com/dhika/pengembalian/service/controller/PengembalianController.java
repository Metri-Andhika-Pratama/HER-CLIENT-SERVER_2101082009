/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dhika.pengembalian.service.controller;

import com.dhika.pengembalian.service.VO.ResponseTemplateVO;
import com.dhika.pengembalian.service.entity.Pengembalian;
import com.dhika.pengembalian.service.service.PengembalianService;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Acer
 */
@RestController
@RequestMapping("/pengembalian")
public class PengembalianController {

    @Autowired
    private PengembalianService pengembalianService;

    @GetMapping("/")
    public List<Pengembalian> getAllPengembalian() {
        return pengembalianService.getAllPengembalian();
    }

    @GetMapping("/{id}")
    public Pengembalian getPengembalianById(@PathVariable("id") Long id) {
        return pengembalianService.getPengembalianById(id);
    }

    @PostMapping("/")
    public Pengembalian savePengembalian(@RequestBody Pengembalian pengembalian) {
        return pengembalianService.savePengembalian(pengembalian);
    }

    @PutMapping("/{id}")
    public Pengembalian updatePengembalian(@PathVariable("id") Long pengembalianId, @RequestBody Pengembalian pengembalian) {
        return pengembalianService.updatePengembalian(pengembalian,pengembalianId);
    }

    @DeleteMapping("/{id}")
    public void deletePengembalianById(@PathVariable("Id") Long id) {
        pengembalianService.deletePengembalianById(id);
    }
}
