package com.example.diego.mvpexample;

/**
 * Created by diego on 26/02/18.
 */

public class AlCuadradoModel implements AlCuadrado.Model
{
    private AlCuadrado.Presenter presenter;
    private double resultado;

    public AlCuadradoModel(AlCuadrado.Presenter presenter)
    {
        this.presenter = presenter;
    }

    public void alCuadrado(String data) {
        if(data.equals(""))
        {
            presenter.showError("Vacio");
        }
        else
        {
            resultado = Double.valueOf(data)*Double.valueOf(data);
            presenter.showResult(String.valueOf(resultado));
        }
    }
}
