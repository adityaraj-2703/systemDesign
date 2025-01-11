package com.design.designPatterns.decoratorPattern.addons;

import java.security.InvalidParameterException;

import com.design.designPatterns.decoratorPattern.Icecream;

public class VanillaScoop implements Icecream {
    private Icecream i;

    public VanillaScoop(Icecream i) {
        if (i == null) {
            throw new InvalidParameterException();
        }
        this.i = i;
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return this.i.getCost() + 50;
    }

    @Override
    public String getComposition() {
        // TODO Auto-generated method stub
        return this.i.getComposition() + " Vanilla Scoop";
    }

    @Override
    public boolean hasIngrediant() {
        // TODO Auto-generated method stub
        return true;
    }

}