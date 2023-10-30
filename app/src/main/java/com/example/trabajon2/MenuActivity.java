package com.example.trabajon2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MenuActivity extends AppCompatActivity {
    private int numberToGuess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess_number_game);

        // Generar un número aleatorio entre 1 y 15
        numberToGuess = new Random().nextInt(15) + 1;

        // Obtener el valor ingresado por el usuario
        EditText editTextUserGuess = findViewById(R.id.editTextUserGuess);
        String userGuess = editTextUserGuess.getText().toString();

        // Comparar con el número a adivinar
        if (!userGuess.isEmpty()) {
            int userGuessInt = Integer.parseInt(userGuess);
            if (userGuessInt == numberToGuess) {
                // Mostrar un mensaje de felicitaciones
                // Puedes personalizar este mensaje según tus necesidades
                Toast.makeText(this, "¡Felicitaciones! Adivinaste el número.", Toast.LENGTH_SHORT).show();
            } else {
                // Mostrar un mensaje de error
                // Puedes personalizar este mensaje según tus necesidades
                Toast.makeText(this, "Te equivocaste, este no era el número.", Toast.LENGTH_SHORT).show();
            }
        }
    }
}


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        Button buttonGuessNumberGame = findViewById(R.id.buttonGuessNumberGame);

        buttonGuessNumberGame.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                // Iniciar la actividad del juego de adivinar el número
                Intent intent = new Intent(MenuActivity.this, GuessNumberGameActivity.class);
                startActivity(intent);
            }
        });
    }

    private void startActivity(Intent intent) {
    }
}
public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        Button buttonOpenMaps = findViewById(R.id.buttonOpenMaps);

        buttonOpenMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crear un Intent para abrir Google Maps
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Google+Maps");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            }
        }
    }
}