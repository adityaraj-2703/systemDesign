package com.design.designPatterns.prototype;

import com.design.designPatterns.prototype.addons.ChocoScoop;
import com.design.designPatterns.prototype.addons.VanillaScoop;
import com.design.designPatterns.prototype.cones.ChocolateCone;
import com.design.designPatterns.prototype.cones.OrangeCone;
import com.design.designPatterns.prototype.cones.VanillaCone;

public class Client {
    public static void main(String[] args) {
        IcecreamRegistry icecreamRegistry = new IcecreamRegistry();

        Icecream chocoVanillaOrangeChoco = new ChocoScoop(
                new VanillaScoop(
                        new OrangeCone(
                                new ChocolateCone())));
        icecreamRegistry.put(IcecreamMenu.chocoVanillaOrangeChoco, chocoVanillaOrangeChoco);

        Icecream chocoVanillaChocoOrangeVanilla = new VanillaScoop(
                new ChocolateCone(new OrangeCone(new VanillaCone())));
        icecreamRegistry.put(IcecreamMenu.chocoVanillaChocoOrangeVanilla, chocoVanillaChocoOrangeVanilla);
        System.out.println(chocoVanillaChocoOrangeVanilla.getComposition());

        Icecream clone = icecreamRegistry.get(IcecreamMenu.chocoVanillaOrangeChoco);
        Icecream order = new ChocoScoop(clone);
        System.out.println(order);

    }

}
