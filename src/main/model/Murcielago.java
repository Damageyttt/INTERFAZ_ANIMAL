package main.model;

import main.model.interfaces.volarAble;
import main.model.interfaces.RespirarAble;


public class Murcielago implements volarAble, RespirarAble {

    @Override
    public void volar() {
        System.out.println("El murciélago vuela");
    }

    @Override
    public void respirar() {
        System.out.println("El murciélago respira");
    }
}
