package ServiceHTTP.repository;


import ServiceHTTP.entity.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location,Integer> {
    Location findFirstByIdlocationIs(int id_location);
}

