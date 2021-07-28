package com.Project.ServiceManagement.master.Country_Master.Repository;

import com.Project.ServiceManagement.master.Country_Master.Domain.country_master;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface country_masterRepository extends JpaRepository<country_master,Integer> {

    @Query(value = "select * from country_master where country_name = :name",nativeQuery = true)
    List<country_master> countryList(@Param("name") String name);

    @Query(value = "CALL getCountryDetails();",nativeQuery = true)
    List<country_master> countryListByProcedure();
}
