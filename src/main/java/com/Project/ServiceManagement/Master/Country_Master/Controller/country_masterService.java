package com.Project.ServiceManagement.Master.Country_Master.Controller;

import com.Project.ServiceManagement.Master.Country_Master.Domain.country_master;
import com.Project.ServiceManagement.Master.Country_Master.Repository.country_masterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class country_masterService {

    @Autowired
    private country_masterRepository countryMasterRepository;

    public List<country_master> showAllCountry()
    {
        return countryMasterRepository.findAll();
    }

    public country_master addCountryDetails(country_master countryMaster)
    {
        return countryMasterRepository.save(countryMaster);
    }

    public country_master updateCountryDetails(country_master countryMaster)
    {
        country_master countryMaster1 = countryMasterRepository.findById(countryMaster.getId()).orElse(null);
        countryMaster1.setCountry_name(countryMaster.getCountry_name());
        countryMaster1.setCountry_code(countryMaster.getCountry_code());
        countryMaster1.setCountry_description(countryMaster.getCountry_description());
        countryMaster1.setActive_status(countryMaster.isActive_status());
        countryMasterRepository.save(countryMaster1);
        return countryMaster1;
    }

    public String deleteCountryDetails(country_master countryMaster)
    {
        country_master countryMaster1 = countryMasterRepository.findById(countryMaster.getId()).orElse(null);
        if(countryMaster1!=null)
        {
            countryMasterRepository.deleteById(countryMaster.getId());
            return "Data Deleted";
        }
        else
        {
            return "Country with Id is not there in Database";
        }
    }
}
