package com.utic.actividad2_4;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
    }

    public void autenticar(View v) {  // Nombre de la función debe coincidir con android:onClick en XML
        String clave = et2.getText().toString();
        if (clave.length() == 0) {
            Toast notificacion = Toast.makeText(this, "La clave no puede quedar vacía", Toast.LENGTH_LONG);
            notificacion.show();
        }
    }
}