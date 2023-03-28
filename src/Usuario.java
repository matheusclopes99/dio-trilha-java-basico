package src;

public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTv = new SmartTV();
        System.out.println("A TV está: " + smartTv.ligada);
        System.out.println("A TV está no canal: " + smartTv.canal);
        System.out.println("A TV está no volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("A TV está: " + smartTv.ligada);
    }
}
