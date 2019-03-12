package Logic;

import java.util.Date;

public class Reservor {
    private String name;
    private Date ReservedAt;

    public String getName()
    {
        return this.name;
    }
    private String setName(String name)
    {
        this.name = name;
        return name;
    }

    public Date getReservedAt() {
        return ReservedAt;
    }
    private Date setReservedAt(Date date)
    {
        return ReservedAt = date;
    }

    public Reservor(String name, Date reservedAt)
    {
        this.name = name;
        this.ReservedAt = reservedAt;
    }
}
