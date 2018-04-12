package edu.ipn.cecyt9.examen_primer_parcial_campiranavilaram;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView usr, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usr = findViewById(R.id.name);
        pass = findViewById(R.id.password);
    }

    public void valida(View view) {
        if (usr.getText().toString().trim().equals("campi") && pass.getText().toString().trim().equals("123")) {
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("usr", usr.getText().toString());
            startActivity(intent);
        }else {
//            Toast.makeText(this, "datos erroneos", Toast.LENGTH_SHORT).show();
            final AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setTitle("Upps! sucedio un error")
                    .setMessage("datos erroneos")
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).show();
        }
    }
}
