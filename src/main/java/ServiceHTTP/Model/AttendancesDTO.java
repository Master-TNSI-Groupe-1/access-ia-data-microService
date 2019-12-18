package ServiceHTTP.Model;

import ServiceHTTP.entity.Attendances;

public class AttendancesDTO extends Attendances {

    public AttendancesDTO(){
        super();
    }

    public AttendancesDTO(Attendances att, int number_max){
        this.setCurrentdate(att.getCurrentdate());
        this.setIdattendances(att.getIdattendances());
        this.setTicks(att.getTicks());
        this.setIdlocation(att.getIdlocation());
        this.setNumberuser(att.getNumberuser());
        this.number_max = number_max;
    }
    private int number_max;

    public int getNumber_max() {
        return number_max;
    }

    public void setNumber_max(int number_max) {
        this.number_max = number_max;
    }
}
