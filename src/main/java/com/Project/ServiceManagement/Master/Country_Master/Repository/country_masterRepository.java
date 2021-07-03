package com.Project.ServiceManagement.Master.Country_Master.Repository;

import com.Project.ServiceManagement.Master.Country_Master.Domain.country_master;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface country_masterRepository extends JpaRepository<country_master,Integer> {

}
