package id.sch.smktelkom_mlg.tugas01.xirpl338.hitungsuhu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    int suhuawal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Klik(View v) {
        switch (v.getId()) {
            case R.id.angka1:
                suhuawal *= 10;
                suhuawal += 1;
                break;

            case R.id.angka2:
                suhuawal *= 10;
                suhuawal += 2;
                break;

            case R.id.angka3:
                suhuawal *= 10;
                suhuawal += 3;
                break;

            case R.id.angka4:
                suhuawal *= 10;
                suhuawal += 4;
                break;

            case R.id.angka5:
                suhuawal *= 10;
                suhuawal += 5;
                break;
        }
        EditText awal = findViewById(R.id.SuhuAwal);
        if (awal.getText().length() < 5) {
            awal.setText(String.valueOf(suhuawal));
        }
    }
}
