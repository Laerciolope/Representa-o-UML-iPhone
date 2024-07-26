package Celular.Apps.iphone;



import Celular.Apps.AparelhoTelefonico;
import Celular.Apps.NavegadorInternet;
import Celular.Apps.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico,NavegadorInternet,ReprodutorMusical{
    
    public void ligar (){
        System.out.println("ligando");
    }
    public void atender (){
        System.out.println("atendendo ");
    }
    public void iniciarCorreioVoz (){
        System.out.println("iniciado correio de voz");
    }
    public void exibirPagina (){
        System.out.println("exibindo pagina");
    }
    public void atualizarPagina (){
        System.out.println("atualizado pagina");
    }
    public void adicionarNovaAba (){
        System.out.println("adicionando nova aba");
    }
    public void tocar (){
        System.out.println("tocando ");
    }
    public void pausar (){
        System.out.println("pausado");
    }
    public void selecionarMusica (){
        System.out.println("selecionado a musica");
    }

}
