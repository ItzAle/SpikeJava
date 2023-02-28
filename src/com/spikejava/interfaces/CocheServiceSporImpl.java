package com.spikejava.interfaces;

import com.spikejava.Coche;
import com.spikejava.CocheHibrido;
import com.spikejava.interfaces.CocheService;

public class CocheServiceSporImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche deportivo");
        return new CocheHibrido();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche deportivo");
    }
}
