package com.Project.ServiceManagement.master.MakeMaster.Controller;

import com.Project.ServiceManagement.master.Country_Master.Controller.ResourceNotFoundException;
import com.Project.ServiceManagement.master.Country_Master.Domain.country_master;
import com.Project.ServiceManagement.master.MakeMaster.Domain.MakeMaster;
import com.Project.ServiceManagement.master.MakeMaster.Repository.MakeMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MakeMasterService {

    @Autowired
    private MakeMasterRepository makeMasterRepository;

    public List<MakeMaster> showAllMake()
    {
        return makeMasterRepository.findAll();
    }

    public MakeMaster addMakeDetails(@RequestBody MakeMaster makeMaster)
    {
        return makeMasterRepository.save(makeMaster);
    }

    public MakeMaster showAllMakeById(int id) {
        return makeMasterRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee Not exist with Id" + id));
    }

    public String updateMakeDetails(@RequestBody MakeMaster makeMaster)
    {
        MakeMaster makeMaster1 = makeMasterRepository.findById(makeMaster.getId()).orElse(null);
        if(makeMaster1!=null)
        {
            makeMaster1.setMakeName(makeMaster.getMakeName());
            makeMaster1.setMakeCode(makeMaster.getMakeCode());
            makeMaster1.setMakeDescription(makeMaster.getMakeDescription());
            makeMasterRepository.save(makeMaster1);
            return "Details Updated and Saved";
        }
        else
        {
            return "Country with given ID does Not Exist";
        }

    }
}
