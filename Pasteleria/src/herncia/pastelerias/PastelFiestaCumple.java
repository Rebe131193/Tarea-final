package herncia.pastelerias;

public class PastelFiestaCumple extends Pastel{
    private  int Velas;



    public String getSabor(){

        String sabor = "Chocolate";

        return sabor;
    }

    public  int setVelas(int velas){
        return   this.Velas = velas;
    }




    public int getVelas(){
        return this.Velas;
    }


}
