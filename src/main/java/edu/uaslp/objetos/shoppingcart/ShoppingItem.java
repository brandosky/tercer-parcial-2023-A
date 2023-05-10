package edu.uaslp.objetos.shoppingcart;

import java.util.Objects;

public final class ShoppingItem {

    private final String name;
    private final String description;
    private final String code;
    private final int unitCostInCents;

    ShoppingItem(String name, String description, String code, int unitCostInCents) {
        this.name = name;
        this.description = description;
        this.code = code;
        this.unitCostInCents = unitCostInCents;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCode() {
        return code;
    }

    public int getUnitCostInCents() {
        return unitCostInCents;
    }

    public double getUnitCostInPesos() {
        return unitCostInCents / 100.0;
    }


    public boolean equals(Object o){
if(this==o)return true;
if(o==null||getClass()!=o.getClass())return false;

        ShoppingItem that=(ShoppingItem)o;

        if(unitCostInCents!= that.unitCostInCents)return false;
if(!Objects.equals(name,that.name))return false;
if(!Objects.equals(description,that.description))
    return false;
return Objects.equals(code,that.code);
    }
}
