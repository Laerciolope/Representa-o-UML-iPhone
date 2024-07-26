 package Celular;

import Celular.Apps.iphone.Iphone;

public class Celular {

      public static void main (String[]args){

        Iphone iphone = new Iphone();
        
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();


    }



}