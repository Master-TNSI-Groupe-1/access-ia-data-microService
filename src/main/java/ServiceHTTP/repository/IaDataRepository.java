package ServiceHTTP.repository;

import ServiceHTTP.entity.Attendances;
import ServiceHTTP.entity.IaData;
import org.springframework.data.repository.CrudRepository;

public interface IaDataRepository extends CrudRepository<IaData,Integer> {
}
