package com.company;

public class Main {

    public static void main(String[] args) {
        punktMaterialny pierwszy = new punktMaterialny();   //tworzy obiekt z użyciem konstruktora domyślnego
        punktMaterialny drugi = new punktMaterialny(4); //tworzy obiekt z użyciem konstruktora z paramtrem

        pierwszy.opis();                                    //wywołanie kolejnych metod dla obiektu pierweszgo
        pierwszy.masa();
        pierwszy.momentGlowny();
        pierwszy.momentStainer(4);

        drugi.opis();                                       //wywołanie kolejnych metod dla obiektu drugiego
        drugi.masa();
        drugi.momentGlowny();
        drugi.momentStainer(4);

        pierwszy.zmianaMasy(5);                         //zmiana masy pierwszego obiektu
        pierwszy.opis();                                    //wywołanie kolejnych metod dla zmienionego obiektu
        pierwszy.masa();
        pierwszy.momentGlowny();
        pierwszy.momentStainer(4);

        int a = 10;                                         //ustala wielkość tablicy

        punktMaterialny[] zbior = new punktMaterialny[a];
        for(int i=1; i<a; i++){                             //tworzy obiekty z różnymi masami w tablicy
            punktMaterialny x = new punktMaterialny(i);
            zbior[i-1] = x;
        }
        for(int i=0; i<a-1;i++){                            //wywołanie kolejnych metod dla kolejnych obiektów tablicy
            punktMaterialny x = zbior[i];
            x.opis();
            x.masa();
            x.momentGlowny();
            x.momentStainer(4);
        }
    }
}
