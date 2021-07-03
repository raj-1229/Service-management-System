package com.Project.ServiceManagement.Master.Country_Master.Controller;

import com.Project.ServiceManagement.Master.Country_Master.Domain.country_master;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country_master/")
public class country_masterController {


    @Autowired
    private country_masterService countryMasterService;

    @GetMapping("/showAllCountry")
    public List<country_master> showAllCountry()
    {
        return countryMasterService.showAllCountry();
    }

    @PostMapping("/addCountryDetails")
    public country_master addCountryDetails(@RequestBody country_master countryMaster)
    {
        return countryMasterService.addCountryDetails(countryMaster);
    }

    @PutMapping("/updateCountryDetails")
    public country_master updateCountryDetails(@RequestBody country_master countryMaster)
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
