package com.design.designPatterns.decoratorPattern.cones;

import java.security.InvalidParameterException;

import com.design.designPatterns.decoratorPattern.Icecream;

public class VanillaCone implements Icecream {
    public VanillaCone() {
    }

    private Icecream i;

    public VanillaCone(Icecream i) {
        if (i == null) {
            throw new InvalidParameterException();
        }
        if (i.hasIngrediant()) {
            throw new InvalidParameterException();
        }
        this.i = i;
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        int cost = ConeCosts.VANILLA_COST;
        if (this.i != null) {
            cost += i.getCost();
        }
        return cost;
    }

    @Override
    public String getComposition() {
        // TODO Auto-generated method stub
        String composition = " Vanilla Cone";
        if (this.i != null) {
            composition = i.getComposition() + i;
        }
        return composition;
    }

    @Override
    public boolean hasIngrediant() {
        // TODO Auto-generated method stub
        return false;
    }
}
