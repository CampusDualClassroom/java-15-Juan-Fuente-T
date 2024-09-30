package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    protected Date expirationDate;
    protected SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area,
                            String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public StringBuilder getSpecificData() {
        StringBuilder builder = new StringBuilder();
        builder.append("Localizacion: ");
        builder.append(super.getLocation());
        builder.append(", Caducidad: ");
        builder.append(this.getFormattedDate(this.expirationDate));
        return builder;
    }

    public void printSpecificData() {
        System.out.println(getSpecificData());
    }


    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public String getFormattedDate(Date expirationDate) {
        return sdf.format(expirationDate);
    }
}
