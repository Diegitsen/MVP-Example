package com.example.diego.mvpexample;

/**
 * Created by diego on 26/02/18.
 */

public class AlCuadradoPresenter implements AlCuadrado.Presenter
{
    private AlCuadrado.View view;
    private AlCuadrado.Model model;

    public AlCuadradoPresenter(AlCuadrado.View view)
    {
        this.view = view;
        model = new AlCuadradoModel(this);
    }

    public void showResult(String r) {
        if(view!=null)
        {
            view.showResult(r);
        }
    }

    @Override
    public void alCuadrado(String data) {
        if(view!=null)
        {
            model.alCuadrado(data);
        }
    }

    @Override
    public void showError(String error) {
        if(view!=null)
        {
            view.showError(error);
        }
    }
}
