package br.com.unipac.calculamedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nome, curso, nota1, nota2, nota3, nota4;
    Button addCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nota1 = (EditText) findViewById(R.id.nota1_id);
        nota2 = (EditText) findViewById(R.id.nota2_id);
        nota3 = (EditText) findViewById(R.id.nota3_id);
        nota4 = (EditText) findViewById(R.id.nota4_id);

        addCalc = (Button) findViewById(R.id.button);

        addCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double valorNota1 = Double.parseDouble(nota1.getText().toString());
                Double valorNota2 = Double.parseDouble(nota2.getText().toString());
                Double valorNota3 = Double.parseDouble(nota3.getText().toString());
                Double valorNota4 = Double.parseDouble(nota4.getText().toString());

                Double result = (valorNota1 + valorNota2 + valorNota3 + valorNota4) / 4;

                if(result >= 60)
                {
                    Toast.makeText(MainActivity.this, "Aluno aprovado", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Aluno REPROVADO", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
