package com.ck.wi.controller;

import com.ck.wi.model.entity.Equipment;
import com.ck.wi.service.IEquipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class EquipmentController {

    @Autowired
    private IEquipment equipmentService;

    @PostMapping("equipment")
    public Equipment create(@RequestBody Equipment equipment){
        return equipmentService.save(equipment);
    }

    @PutMapping("equipment")
    public Equipment update(@RequestBody Equipment equipment){
        return equipmentService.save(equipment);
    }

    @DeleteMapping("equipment/{id}")
    public void delete(@PathVariable Integer id){
        Equipment equipment = equipmentService.findById(id);
        equipmentService.delete(equipment);
    }

    @GetMapping("equipment/{id}")
    public Equipment showById(@PathVariable Integer id){
        return equipmentService.findById(id);
    }
}
