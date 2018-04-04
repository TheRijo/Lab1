package com.company;

public class punktMaterialny { //tworzy klasę
    int masa; //tworzy zmienne klasy
    int I;
    int Is;
        public punktMaterialny(){ //konstruktor domyślny
            this.masa = 1;
        }
        public punktMaterialny(int m){ //konstruktor z parametrem
            if(m>0){
                masa = m;
            }
            else{
                System.out.println("Masa jest wielkością dodatnią!");
            }
        }
        public int masa(){ //metoda zwracająca masę
            System.out.println(masa);
            return masa;
        }
        public int zmianaMasy( int m ){ //metoda pozwalająca zmianę masy
            if( m > 0){
                masa = m;
            }
            else{
                System.out.println("Masa jest wielkością dodatnią!");
            }
            return masa;
        }
        public int momentGlowny(){ //metoda obliczająca moment główny
            I = 0;
            System.out.println(I);
            return I;
        }
        public int momentStainer( int odleglosc ){ //metofda obliczająca moment dla osi oddalonej o parametr
            Is = I + masa*odleglosc*odleglosc;
            System.out.println(Is);
            return Is;
        }
        public void opis(){ //metoda zwracająca opis obiektu
            System.out.println("Punkt materialny");
        }
}
