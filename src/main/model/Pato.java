package main.model;

import main.model.interfaces.volarAble;
import main.model.interfaces.RespirarAble;
import main.model.interfaces.NadarAble;
import main.model.interfaces.TerrestreAble;

public class Pato implements volarAble, RespirarAble, NadarAble, TerrestreAble {

    @Override
    public void volar() {
        System.out.println("El pato vuela");
    }

    @Override
    public void respirar() {
        System.out.println("El pato respira");
    }

    @Override
    public void nadar() {
        System.out.println("El pato nada");
    }

    @Override
    public void terrestre() {
        System.out.println("El pato se desplaza caminando");
    }
}
