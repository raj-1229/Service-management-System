package com.Project.ServiceManagement.master.MakeMaster.Controller;

import com.Project.ServiceManagement.master.Country_Master.Domain.country_master;
import com.Project.ServiceManagement.master.MakeMaster.Domain.MakeMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/serviceManagement/makeMaster/")
public class MakeMasterController {

    @Autowired
    private MakeMasterService makeMasterService;

    @GetMapping("/showAllMake")
    public List<MakeMaster> showAllMake()
    {
        return makeMasterService.showAllMake();
    }

    @PostMapping("/addMakeDetails")
    public MakeMaster addMakeDetails(@RequestBody MakeMaster makeMaster)
    {
        return makeMasterService.addMakeDetails(makeMaster);
    }

    @GetMapping("/showAllMake/{id}")
    public ResponseEntity<MakeMaster> showAllMake(@PathVariable int id)
    {
        MakeMaster makeMaster = makeMasterService.showAllMakeById(id);
        return ResponseEntity.ok(makeMaster);
    }

    @PutMapping("/updateMakeDetails")
    public String updateMakeDetails(@RequestBody MakeMaster makeMaster)
    {
        return makeMasterService.updateMakeDetails(makeMaster);
    }


}
