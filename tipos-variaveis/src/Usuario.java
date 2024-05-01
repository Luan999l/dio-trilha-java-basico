public class Usuario {
    public static void main (String [] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();    
        System.out.println("Volume atual ?" + smartTv.volume);

        System.out.println("Tv Ligada ?" + smartTv.ligada);
        System.out.println("Canal atual ?" + smartTv.canal);
        System.out.println("Volume atual ?" + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Novo Status -> Canal atual ?" + smartTv.canal);

        smartTv.mudarCanal(15);
        System.out.println("Novo Status -> Canal atual ?" + smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada ?" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada ?" + smartTv.ligada);


    }
}
