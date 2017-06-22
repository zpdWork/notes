package zpd.abstractDemo.demo1;

import java.io.Serializable;
import java.util.Date;

public class Ada1 implements Serializable {
    private static final long serialVersionUID = 6214731930074016392L;

    private String id;
    private Date date;
    private Integer number;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ada1{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", number=" + number +
                '}';
    }
}
