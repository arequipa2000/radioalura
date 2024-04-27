package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Grabriela Aquilar");
        miPodcast.setTitulo("Cafe Tech.");

        for (int i = 0; i < 15500; i++) {
            miCancion.meGusta();
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miCancion.reproduce();
            miPodcast.reproduce();
        }

        System.out.println("Total reproducciones: "+miCancion.getTotalDeReproducciones());
        System.out.println("Total de me Gusta es: "+miCancion.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adiciona(miCancion);
        favoritos.adiciona(miPodcast);
    }
}
