package com.spikejava.interfaces;

import com.spikejava.Coche;
import com.spikejava.CocheElectrico;
import com.spikejava.interfaces.CocheService;

public class CocheServiceClassicImpl implements CocheService {



    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clasico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche clasico");

    }

}
