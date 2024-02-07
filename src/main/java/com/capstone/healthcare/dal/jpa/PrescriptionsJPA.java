package com.capstone.healthcare.dal.jpa;

import com.capstone.healthcare.dal.dataobject.PrescriptionsDO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 
 * 
 * @author xw
 * @email xw
 * @date 2023-10-16 09:23:19
 */
@Repository
public interface PrescriptionsJPA extends CrudRepository<PrescriptionsDO,Integer>, QueryByExampleExecutor<PrescriptionsDO> {
//    @Query("SELECT YEAR(p.prescriptionDate) AS year, COUNT(p) AS count FROM prescriptions p GROUP BY YEAR(p.prescriptionDate)")
//    List<Object> groupByYear();
}
