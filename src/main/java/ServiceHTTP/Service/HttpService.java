package ServiceHTTP.Service;

import ServiceHTTP.entity.Attendances;
import ServiceHTTP.repository.AttendancesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class HttpService {

    @Autowired
    AttendancesRepository attendancesRepository;


    // Récupération de toutes les données d'une journée
    public List<Attendances> getLogsbyDays(int idLocation, Date date){

        Calendar calendarAfter = Calendar.getInstance();
        calendarAfter.setTime(date);
        calendarAfter.add(Calendar.DATE,1);

        return attendancesRepository.findByIdlocationAndCurrentdateAfterAndCurrentdateBefore(idLocation,date,calendarAfter.getTime());
    }

    // Récupération de toutes les données d'une heure
    // exemple 15h on récupère alors
    public List<Attendances> getLogsByHours(int idLocation, Date date) {

        List<Attendances> lstResult = new ArrayList<Attendances>();

        //TODO faire une procédure stockée pour optimisé le temps de cycle
        List<Attendances> LstAttendances = (List<Attendances>)attendancesRepository.findAll();

        LstAttendances.forEach(item -> {
            if(item.getCurrentdate().getHours() == date.getHours())
                lstResult.add(item);
        });

        return lstResult;
        //return attendancesRepository.findByIdlocationAndCurrentdate_Hours(idLocation,date.getHours());
    }
}
