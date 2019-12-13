package ServiceHTTP.repository;


import ServiceHTTP.entity.Attendances;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface AttendancesRepository extends CrudRepository<Attendances,Integer> {

    List<Attendances> findByIdlocationAndCurrentdateAfterAndCurrentdateBefore(int idLocation, Date dateDeb, Date DateFin);

    // List<Attendances> findByIdlocationAndCurrentdate_Hours(int idLocation, Date hours);

}
