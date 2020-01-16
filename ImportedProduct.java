/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author 
 */
public final class ImportedProduct extends Product{
    private Double customFee;

    public ImportedProduct() {
        super();
    }
    
    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    
    
    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }
    
    @Override
    public final String priceTag(){
        price = totalPrice();
        StringBuilder sb = new StringBuilder();
        sb.append(super.priceTag());
        sb.append("(Customs fee: $");
        sb.append(customFee);
        sb.append(")");
        
        return sb.toString();
    }
    public final Double totalPrice(){
        
        return price + customFee;
    }
    
}
