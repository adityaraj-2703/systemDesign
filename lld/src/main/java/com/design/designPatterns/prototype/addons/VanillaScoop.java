package com.design.designPatterns.prototype.addons;

import java.security.InvalidParameterException;

import com.design.designPatterns.prototype.Icecream;
import com.design.designPatterns.prototype.Prototype;

public class VanillaScoop implements Icecream {

    private Icecream icecream;

    public VanillaScoop(Icecream icecream) {
        if (icecream == null) {
            throw new InvalidParameterException();
        }
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return this.icecream.getCost() + 25;
    }

    @Override
    public String getComposition() {
        // TODO Auto-generated method stub
        return this.icecream.getComposition() + "VanillaScoop";
    }

    @Override
    public boolean hasIngrediant() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public Prototype clone() {
        // TODO
        return new VanillaScoop((Icecream) this.icecream.clone());
    }
}
