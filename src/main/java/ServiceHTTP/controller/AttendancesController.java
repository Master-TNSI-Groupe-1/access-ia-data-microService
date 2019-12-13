package ServiceHTTP.controller;

import ServiceHTTP.Service.HttpService;
import ServiceHTTP.entity.Attendances;
import ServiceHTTP.repository.AttendancesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
class AttendancesController {

    @Autowired
    HttpService httpService;

    @GetMapping(value="/try")
    public String toto(){
        return "TU ES TROP FORT";
    }

    @GetMapping(value = "/days/{id}/{date}")
    public List<Attendances> getLogsbyDays(@PathVariable("id") int idLocation, @PathVariable("date") Date date){

        return httpService.getLogsbyDays(idLocation,date);
    }

    @GetMapping(value = "/hours/{id}/{date}")
    public List<Attendances> getLogsbyHours(@PathVariable("id") int idLocation, @PathVariable("date") Date date){

        return httpService.getLogsByHours(idLocation,date);
    }

}
