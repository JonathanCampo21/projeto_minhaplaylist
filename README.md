 Minha Playlist - Orientação a Objetos em Java

Projeto desenvolvido para aplicar conceitos fundamentais de **Programação Orientada a Objetos (POO)** em Java, simulando um sistema de avaliação de áudios (Músicas e Podcasts).

##  Tecnologias Utilizadas

* **Java** (JDK 17+)
* **IntelliJ IDEA**
* **Git/GitHub**

##  Conceitos Praticados

Durante o desenvolvimento deste projeto, foram aplicados os seguintes pilares da POO:

1.  **Abstração:** Criação da classe modelo `Audio`.
2.  **Herança:** As classes `Musica` e `Podcast` herdam atributos e métodos da classe mãe `Audio`.
3.  **Encapsulamento:** Uso de modificadores de acesso (`private`) e métodos acessores (`getters` e `setters`) para proteger os dados.
4.  **Polimorfismo:**
    * Sobrescrita de métodos (`@Override`) para a regra de negócio `getClassificacao` que se comporta de forma diferente para Músicas e Podcasts.
    * Uso da classe genérica `Audio` na classe `MinhasPreferidas`, permitindo que o método receba qualquer objeto que seja filho de Audio.
