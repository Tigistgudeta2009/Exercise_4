package pl.vistula;

public class Car {
    private  String model;
    private  String brand;
    private  String year;
    private  String price;
    private  String color;
    private  String quantity;
     public  Car(String model, String brand, String year , String price, String color, String quantity){
         this.model = model;
         this.brand = brand;
         this.year = year;
         this.price =price;
         this.color =color;
         this.quantity =quantity;
     }
    public void  delivery(int n){
         quantity +=n;

    }
    public void sell(int n){
         quantity -= n;
    }
    public String getModel(){ return  model;}
    public String setModel(String model){ this.model=model;}
    public String getBrand(){ return  brand;}
    public String setBrand(String brand){ this.brand=brand;}
    public String getYear(){ return  year;}
    public String setYear(String year){ this.year=year;}
    public String getPrice(){ return  price;}
    public String setPrice(String price){ this.price=price;}
    public String getColor(){ return  color;}
    public String setColor(String color){ this.color=color;}
    public String getQuantity(){ return  quantity;}
    public String setQuantity(String quantity){ this.quantity=quantity;}
    @Override
    public  String toString(){
         return  " Car{" +
                 "model = '" + model + '\''+
                 ", brand ='" + brand + '\'' +
                 ", year ='" + year + '\'' +
                 ", price ='" + price + '\'' +
                 ", color ='" + color + '\'' +
                 ", quantity ='" + quantity + '\'' +
                 '}';
    }
}
public class CarDemo{
    public static void main(String[] args) {
        Car c = new Car("GLE" ,"Mercedes", 2020, 35000,"red", 4);
        System.out.println( c.toString());
        c.sell(2);
        System.out.println(c.getColor());
        int rok= c.getYear();
        c.setColor("Black");
        System.out.println(c.toString());
    }
}
