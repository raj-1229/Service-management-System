package com.example.demo.controller;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.District;
import com.example.demo.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.module.ResolutionException;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class DistrictController {

    @Autowired
    private DistrictRepository districtRepository;
    //get All Districts
    @GetMapping("/districts")

    public List<District> getAllDistricts()
    {
        return districtRepository.findAll();

    }

    //Create District REST API
    @PostMapping("/districts")
    public District createDistrict(@RequestBody District district){

        return districtRepository.save(district);

    }

    //Get District by Id Rest API
    @GetMapping("/districts/{id}")
    public ResponseEntity<District> getDistrictById (@PathVariable Long id){
        District district = districtRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("District not found with Id :"+id));
        return ResponseEntity.ok(district);
    }

    //Update District Rest API
    @PutMapping("districts/{id}")
    public ResponseEntity<District> updateDistrict(@PathVariable Long id , @RequestBody District districtDetails){
        District district = districtRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("District not found with Id :"+id));


        district.setDistrictName(districtDetails.getDistrictName());
        district.setDistrictCode(districtDetails.getDistrictCode());
        district.setDistrictDescription(districtDetails.getDistrictDescription());
        district.setActiveStatus(districtDetails.getActiveStatus());

        District updatedDistrict = districtRepository.save(district);
        return ResponseEntity.ok(updatedDistrict);
    }


}

