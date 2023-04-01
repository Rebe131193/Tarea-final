package herncia.pastelerias;

public class Pastel {
   private String Sabor;
   private  double Precio;

    public String getSaboractual(){
        Sabor = "Vainilla";
        return this.Sabor;
    }

   public  void setSabor(String sabor){
        this.Sabor = sabor;
   }

   public String getSabor(){
        return Sabor;
   }

   public void setPrecio(double precio){
         this.Precio = precio;

   }
   public double getPrecio(){
       return Precio;
   }





}
