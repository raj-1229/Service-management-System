package com.Project.ServiceManagement.master.Country_Master.Controller;

import com.Project.ServiceManagement.master.Country_Master.Domain.country_master;
import com.Project.ServiceManagement.master.Country_Master.Repository.country_masterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/serviceManagement/countryMaster/")
public class country_masterController {


    @Autowired
    private country_masterRepository countryMasterRepository;
    @Autowired
    private country_masterService countryMasterService;

    @GetMapping("/showAllCountry")
    public List<country_master> showAllCountry()
    {
        return countryMasterService.showAllCountry();
    }


    @GetMapping("/showAllCountryByPro")
    public List<country_master> showAllCount(){
        return countryMasterRepository.countryListByProcedure();
    }

    @GetMapping("/showAllCountry/{id}")
    public ResponseEntity<country_master> showAllCountry_(@PathVariable int id)
    {
       country_master countryMaster = countryMasterService.showAllCountryById(id);
        return ResponseEntity.ok(countryMaster);
    }

    @GetMapping("/showAllCountryByName/{name}")
    public ResponseEntity<List<country_master>> showAllCountryByName_(@PathVariable String name)
    {
        List<country_master> l = countryMasterRepository.countryList(name);
        return ResponseEntity.ok(l);
    }

    @PostMapping("/addCountryDetails")
    public country_master addCountryDetails(@RequestBody country_master countryMaster)
    {
        return countryMasterService.addCountryDetails(countryMaster);
    }

    @PutMapping("/updateCountryDetails")
    public String updateCountryDetails(@RequestBody country_master countryMaster)
    {
        return countryMasterService.updateCountryDetails(countryMaster);
    }

    @DeleteMapping("/deleteCountryDetails")
    public String deleteCountryDetails(@RequestBody country_master countryMaster)
    {
        String str = countryMasterService.deleteCountryDetails(countryMaster);
        return str;
    }


}
