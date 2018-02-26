package com.example.diego.mvpexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AlCuadradoView extends AppCompatActivity implements AlCuadrado.View{

    TextView tvCuadrado;
    EditText etCuadrado;

    private AlCuadrado.Presenter presenter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCuadrado = (TextView)findViewById(R.id.tvCuadrado);
        etCuadrado = (EditText)findViewById(R.id.etCuadrado);
        presenter = new AlCuadradoPresenter(this);
    }

    public void calcular(View v)
    {
        presenter.alCuadrado(etCuadrado.getText().toString());
    }

    @Override
    public void showResult(String r) {
        tvCuadrado.setText(r);
    }

    @Override
    public void showError(String error) {
        tvCuadrado.setText(error);
    }
}
