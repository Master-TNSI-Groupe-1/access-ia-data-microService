package ServiceHTTP.entity;


import javax.persistence.*;

import java.util.Calendar;


@Table(name="iadata")
@Entity
public class IaData {

    public IaData(){

    }

    public  IaData(int id_location, String json){

        this.date_update = Calendar.getInstance().getTime().getTime();
        this.id_location = id_location;
        this.json_object = json;

    }

    @Id
    @GeneratedValue
    @Column(name = "id_data")
    private int ia_data;

    @Column(name = "date_update")
    private long date_update;

    @Column(name = "id_location")
    private int id_location;

    @Column(name = "json_object")
    private String json_object;

    public int getIa_data() {
        return ia_data;
    }

    public void setIa_data(int ia_data) {
        this.ia_data = ia_data;
    }

    public long getDate_update() {
        return date_update;
    }

    public void setDate_update(int date_update) {
        this.date_update = date_update;
    }

    public int getId_location() {
        return id_location;
    }

    public void setId_location(int id_location) {
        this.id_location = id_location;
    }

    public String getJson_object() {
        return json_object;
    }

    public void setJson_object(String json_object) {
        this.json_object = json_object;
    }


}
