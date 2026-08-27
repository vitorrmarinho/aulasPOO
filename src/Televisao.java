public class Televisao {
    boolean ligada = false;
    int canal = 1;
    int volume = 0;

    public void ligarDesligar(){
        ligada = !ligada;
        if(ligada == true){
            System.out.println("A Tv está ligada");
        }
        else{
            System.out.println("A tv está desligada");
        }
    }
    public void aumentarVolume(){
        if (ligada == true) {
        this.volume = volume +1;
        System.out.println("volume atual"+ volume);
        }
        else {
            System.out.println("Precisa ligar a tv");
        }
    }
    public void diminuirVolume(){
        if (ligada == true){
         this.volume = volume -1;
        System.out.println("volume atual"+ volume);
        }
        else{
            System.out.println("Precisa ligar a tv");
        }
    }
    public void aumentarCanal (){
        if(ligada == true){
        // 1 para aumentar|| -1 para diminuir
        canal ++;
        System.out.println("Canal atual" + canal);
        }
        else{
            System.out.println("Precisa ligar a tv");
        }
    }
      public void diminuirCanal (){
        if(ligada == true){
        // 1 para aumentar|| -1 para diminuir
        System.out.println("Canal atual" + canal);
        }
        else{
            System.out.println("Precisa ligar a tv");
        }
    }
    public void escolherCanal(int canalEscolhido){
        if (ligada == true) {
           this.canal = canalEscolhido;
            System.out.println("Canal atual" + canal);
        }
        else{
            System.out.println("Precisa ligar a tv");
        }

    }


}
