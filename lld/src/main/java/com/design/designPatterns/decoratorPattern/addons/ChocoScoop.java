package com.design.designPatterns.decoratorPattern.addons;

import java.security.InvalidParameterException;

import com.design.designPatterns.decoratorPattern.Icecream;

public class ChocoScoop implements Icecream {

    private Icecream i;

    public ChocoScoop(Icecream i) {
        if (i == null) {
            throw new InvalidParameterException();
        }
        this.i = i;
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return this.i.getCost() + 30;
    }

    @Override
    public String getComposition() {
        // TODO Auto-generated method stub
        return this.i.getComposition() + " Choco Scoop";
    }

    @Override
    public boolean hasIngrediant() {
        // TODO Auto-generated method stub
        return true;
    }

}
