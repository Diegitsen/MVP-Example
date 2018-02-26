package com.example.diego.mvpexample;

/**
 * Created by diego on 26/02/18.
 */

public interface AlCuadrado {

    interface View{
        void showResult(String r);
        void showError(String error);
    }

    interface Presenter{
        void showResult(String r);
        void alCuadrado(String data);
        void showError(String error);
    }

    interface Model{
        void alCuadrado(String data);
    }
}
