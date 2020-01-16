/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 
 */
public final class UsedProduct extends Product{
    private Date manufactureDate;
    private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, String manufactureDate) throws ParseException {
        super(name, price);
        this.manufactureDate = sdf.parse(manufactureDate);
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) throws ParseException {
        this.manufactureDate = sdf.parse(manufactureDate);
    }
    
    @Override
    public final String priceTag(){
        name += " (used)";
        StringBuilder sb = new StringBuilder();
        sb.append(super.priceTag());
        sb.append(" (Manufacture date: ");
        sb.append(sdf.format(manufactureDate));
        sb.append(")");
        
        return sb.toString();
    }
    
}
