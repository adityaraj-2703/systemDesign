package com.design.designPatterns.decoratorPattern;

import com.design.designPatterns.decoratorPattern.addons.ChocoScoop;
import com.design.designPatterns.decoratorPattern.addons.VanillaScoop;
import com.design.designPatterns.decoratorPattern.cones.ChocolateCone;

public class Client {
    public static void main(String[] args) {
        Icecream chocoVanillaChocolateCone = new ChocoScoop(new VanillaScoop(new ChocolateCone()));
        System.out.println(chocoVanillaChocolateCone.getComposition());
    }
}
