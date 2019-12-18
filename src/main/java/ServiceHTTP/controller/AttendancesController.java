package ServiceHTTP.controller;

import ServiceHTTP.Model.AttendancesDTO;
import ServiceHTTP.Service.HttpService;
import ServiceHTTP.entity.Attendances;
import ServiceHTTP.repository.AttendancesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/api")
class AttendancesController {

    @Autowired
    HttpService httpService;

    @GetMapping(value = "/try")
    public String toto() {
        return "TU ES TROP FORT";
    }

    @GetMapping(value = "/days/{id}/{strdate}")
    public List<AttendancesDTO> getLogsbyDays(@PathVariable("id") int idLocation, @PathVariable("strdate") long strdate) {

        try {
            Timestamp stamp = new Timestamp(strdate);

            Date date = new Date(stamp.getTime());
            System.out.println(date);
           // DateFormat format = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss", Locale.FRANCE);
            //date = format.parse(date.toString());


            return httpService.getNumberPlaces(httpService.getLogsbyDays(idLocation, date));
        } catch (Exception e) {
            System.out.println("toto");
            return null;
        }

    }

    @GetMapping(value = "/hours/{id}/{strdate}")
    public List<AttendancesDTO> getLogsbyHours(@PathVariable("id") int idLocation, @PathVariable("strdate") long strdate) {

        try {
            Timestamp stamp = new Timestamp(strdate);

            Date date = new Date(stamp.getTime());

           // DateFormat format = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss", Locale.FRANCE);
            //date = format.parse(date.toString());

            return httpService.getNumberPlaces(httpService.getLogsbyDays(idLocation, date));
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping(value = "/daysAfter/{id}/{strdate}")
    public List<AttendancesDTO> getLogsbyDayAfter(@PathVariable("id") int idLocation, @PathVariable("strdate") long strdate) {
        try {
            Timestamp stamp = new Timestamp(strdate);

            Date date = new Date(stamp.getTime());
            //DateFormat format = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss", Locale.FRANCE);
            //date = format.parse(date.toString());

            return httpService.getNumberPlaces(httpService.getLogsbyDays(idLocation, date));

        } catch (Exception e) {

            return null;
        }

    }



}
