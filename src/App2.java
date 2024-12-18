import Jogador.Goleiro;
import Jogador.Laterais;
import Jogador.MeioCampista;
import Jogador.Zagueiros;
import Jogador.Atacantes;
public class App2 {
    public static void main(String[] args) {
        System.out.println("Time do Real Madrid: ");
        Goleiro goleiro = new Goleiro("Courtois");
        goleiro.defender();
        goleiro.agarrar();
        Laterais lateralDireito = new Laterais("Carvajal");
        lateralDireito.Coringa();
        lateralDireito.apoiarLados();
        lateralDireito.defenderLador();
        Laterais lateralEsquerdo = new Laterais("Mendy");
        lateralEsquerdo.Coringa();
        lateralEsquerdo.apoiarLados();
        lateralEsquerdo.defenderLador();
        Zagueiros zagueiro = new Zagueiros("Rudiger");
        zagueiro.defender();
        zagueiro.DefenderCampo();
        Zagueiros zagueiro1 = new Zagueiros("Eder Militão");
        zagueiro1.defender();
        zagueiro1.DefenderCampo();
        MeioCampista volante=new MeioCampista("Tchouaméni");
        volante.Coringa();
        volante.volante();
        MeioCampista meiocampo=new MeioCampista("Valverde");
        meiocampo.meiocampo();
        meiocampo.Ligar();
        MeioCampista meioatacante = new MeioCampista("Jude Bellingham");
        meioatacante.meioatacante();
        meioatacante.atacar();
        Atacantes pontaesquerda = new Atacantes("Vinicius Júnior");
        pontaesquerda.atacar();
        pontaesquerda.atacará();
        Atacantes pontadireita = new Atacantes("Rodrigo");
        pontadireita.atacará();
        Atacantes centrovante = new Atacantes("Mbappé");
        centrovante.atacar();
        centrovante.atacará();



        

        

         
    }


}
