package com.Project.ServiceManagement.master.MakeMaster.Repository;

import com.Project.ServiceManagement.master.MakeMaster.Domain.MakeMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakeMasterRepository extends JpaRepository<MakeMaster,Integer> {
}
