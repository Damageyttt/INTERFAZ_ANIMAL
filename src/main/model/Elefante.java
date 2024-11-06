package main.model;

import main.model.interfaces.RespirarAble;
import main.model.interfaces.TerrestreAble;

public class Elefante implements RespirarAble, TerrestreAble {

    @Override
    public void respirar() {
        System.out.println("El elefante respira");
    }

    @Override
    public void terrestre() {
        System.out.println("El elefante se desplaza de forma terrestre");
    }
}
