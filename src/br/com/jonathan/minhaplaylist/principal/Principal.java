package br.com.jonathan.minhaplaylist.principal;

import br.com.jonathan.minhaplaylist.modelos.MinhasPreferidas;
import br.com.jonathan.minhaplaylist.modelos.Musica;
import br.com.jonathan.minhaplaylist.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Podcast meuPodcast= new Podcast();
        meuPodcast.setTitulo("Amor a Cristo");
        meuPodcast.setApresentador("Theo Rayashi");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 800; i++) {
            meuPodcast.curte();
        }

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("GoodBye Yesterday");
        minhaMusica.setCantor("Elevation GYHM");

        for (int i = 0; i < 190 ; i++) {
            minhaMusica.reproduz();
            
        }

        for (int i = 0; i <50 ; i++) {
            minhaMusica.curte();
        }



        MinhasPreferidas preferidas= new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);


    }
}
