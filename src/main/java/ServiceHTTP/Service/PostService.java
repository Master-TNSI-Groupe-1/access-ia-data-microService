package ServiceHTTP.Service;

import ServiceHTTP.entity.IaData;
import ServiceHTTP.repository.AttendancesRepository;
import ServiceHTTP.repository.IaDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    IaDataRepository iaDataRepository;

    public boolean addNewIaData(int idLocation, String data){

        try {
            // Ajout en base
            iaDataRepository.save(new IaData(idLocation,data));
            return true;
        } catch (Exception e){
            return false;
        }

    }
}
