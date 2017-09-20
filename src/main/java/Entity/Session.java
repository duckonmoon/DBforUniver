package Entity;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Session extends BaseEntity{
    private Date startdate;
    private Date enddate;

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
}
