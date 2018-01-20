package id.sch.smktelkom_mlg.tugas01.xirpl338.hitungsuhu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    int suhuawal = 0;
    double suhuakhir = 0;
    EditText sawal;
    EditText sakhir;
    Spinner aw, ak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sawal = findViewById(R.id.SuhuAwal);
        sakhir = findViewById(R.id.SuhuAkhir);
        aw = findViewById(R.id.awal);
        ak = findViewById(R.id.akhir);
        aw.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                if (aw.getSelectedItemPosition() == 0) {
                    if (ak.getSelectedItemPosition() == 0) {
                        suhuakhir = suhuawal;
                    } else if (ak.getSelectedItemPosition() == 1) {
                        suhuakhir = suhuawal * 4 / 5;
                    } else if (ak.getSelectedItemPosition() == 2) {
                        suhuakhir = suhuawal * 9 / 5 + 32;
                    } else if (ak.getSelectedItemPosition() == 2) {
                        suhuakhir = suhuawal + 273;
                    }
                } else if (aw.getSelectedItemPosition() == 1) {
                    if (ak.getSelectedItemPosition() == 0) {
                        suhuakhir = suhuawal * 5 / 4;
                    } else if (ak.getSelectedItemPosition() == 1) {
                        suhuakhir = suhuawal;
                    } else if (ak.getSelectedItemPosition() == 2) {
                        suhuakhir = (suhuawal * 5 / 4) * 9 / 5 + 32;
                    } else if (ak.getSelectedItemPosition() == 2) {
                        suhuakhir = suhuawal * 5 / 4 + 273;
                    }
                } else if (aw.getSelectedItemPosition() == 2) {
                    if (ak.getSelectedItemPosition() == 0) {
                        suhuakhir = (suhuawal - 32) * 5 / 9;
                    } else if (ak.getSelectedItemPosition() == 1) {
                        suhuakhir = ((suhuawal - 32) * 5 / 9) * 4 / 5;
                    } else if (ak.getSelectedItemPosition() == 2) {
                        suhuakhir = suhuawal;
                    } else if (ak.getSelectedItemPosition() == 3) {
                        suhuakhir = ((suhuawal - 32) * 5 / 9) + 273;
                    }
                } else if (aw.getSelectedItemPosition() == 3) {
                    if (ak.getSelectedItemPosition() == 0) {
                        suhuakhir = suhuawal - 273;
                    } else if (ak.getSelectedItemPosition() == 1) {
                        suhuakhir = (suhuawal - 273) * 4 / 5;
                    } else if (ak.getSelectedItemPosition() == 2) {
                        suhuakhir = (suhuawal - 273) * 9 / 5 + 32;
                    } else if (ak.getSelectedItemPosition() == 3) {
                        suhuakhir = suhuawal;
                    }
                }
                sakhir.setText(String.valueOf(suhuakhir));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }

        });
        ak.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                if (aw.getSelectedItemPosition() == 0) {
                    if (ak.getSelectedItemPosition() == 0) {
                        suhuakhir = suhuawal;
                    } else if (ak.getSelectedItemPosition() == 1) {
                        suhuakhir = suhuawal * 4 / 5;
                    } else if (ak.getSelectedItemPosition() == 2) {
                        suhuakhir = suhuawal * 9 / 5 + 32;
                    } else if (ak.getSelectedItemPosition() == 2) {
                        suhuakhir = suhuawal + 273;
                    }
                } else if (aw.getSelectedItemPosition() == 1) {
                    if (ak.getSelectedItemPosition() == 0) {
                        suhuakhir = suhuawal * 5 / 4;
                    } else if (ak.getSelectedItemPosition() == 1) {
                        suhuakhir = suhuawal;
                    } else if (ak.getSelectedItemPosition() == 2) {
                        suhuakhir = (suhuawal * 5 / 4) * 9 / 5 + 32;
                    } else if (ak.getSelectedItemPosition() == 2) {
                        suhuakhir = suhuawal * 5 / 4 + 273;
                    }
                } else if (aw.getSelectedItemPosition() == 2) {
                    if (ak.getSelectedItemPosition() == 0) {
                        suhuakhir = (suhuawal - 32) * 5 / 9;
                    } else if (ak.getSelectedItemPosition() == 1) {
                        suhuakhir = ((suhuawal - 32) * 5 / 9) * 4 / 5;
                    } else if (ak.getSelectedItemPosition() == 2) {
                        suhuakhir = suhuawal;
                    } else if (ak.getSelectedItemPosition() == 3) {
                        suhuakhir = ((suhuawal - 32) * 5 / 9) + 273;
                    }
                } else if (aw.getSelectedItemPosition() == 3) {
                    if (ak.getSelectedItemPosition() == 0) {
                        suhuakhir = suhuawal - 273;
                    } else if (ak.getSelectedItemPosition() == 1) {
                        suhuakhir = (suhuawal - 273) * 4 / 5;
                    } else if (ak.getSelectedItemPosition() == 2) {
                        suhuakhir = (suhuawal - 273) * 9 / 5 + 32;
                    } else if (ak.getSelectedItemPosition() == 3) {
                        suhuakhir = suhuawal;
                    }
                }
                sakhir.setText(String.valueOf(suhuakhir));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }

        });
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

            case R.id.angka6:
                suhuawal *= 10;
                suhuawal += 6;
                break;

            case R.id.angka7:
                suhuawal *= 10;
                suhuawal += 7;
                break;

            case R.id.angka8:
                suhuawal *= 10;
                suhuawal += 5;
                break;

            case R.id.angka9:
                suhuawal *= 10;
                suhuawal += 5;
                break;

            case R.id.angka0:
                suhuawal *= 10;
                suhuawal += 0;
                break;

            case R.id.clear:
                suhuawal = 0;
                sawal.setText("");
                break;

            case R.id.delete:
                suhuawal /= 10;
                sawal.setText(String.valueOf(suhuawal));
                break;
        }

        if (sawal.getText().length() < 5) {
            sawal.setText(String.valueOf(suhuawal));
        }

        if (aw.getSelectedItemPosition() == 0) {
            if (ak.getSelectedItemPosition() == 0) {
                suhuakhir = suhuawal;
            } else if (ak.getSelectedItemPosition() == 1) {
                suhuakhir = suhuawal * 4 / 5;
            } else if (ak.getSelectedItemPosition() == 2) {
                suhuakhir = suhuawal * 9 / 5 + 32;
            } else if (ak.getSelectedItemPosition() == 2) {
                suhuakhir = suhuawal + 273;
            }
        } else if (aw.getSelectedItemPosition() == 1) {
            if (ak.getSelectedItemPosition() == 0) {
                suhuakhir = suhuawal * 5 / 4;
            } else if (ak.getSelectedItemPosition() == 1) {
                suhuakhir = suhuawal;
            } else if (ak.getSelectedItemPosition() == 2) {
                suhuakhir = (suhuawal * 5 / 4) * 9 / 5 + 32;
            } else if (ak.getSelectedItemPosition() == 2) {
                suhuakhir = suhuawal * 5 / 4 + 273;
            }
        } else if (aw.getSelectedItemPosition() == 2) {
            if (ak.getSelectedItemPosition() == 0) {
                suhuakhir = (suhuawal - 32) * 5 / 9;
            } else if (ak.getSelectedItemPosition() == 1) {
                suhuakhir = ((suhuawal - 32) * 5 / 9) * 4 / 5;
            } else if (ak.getSelectedItemPosition() == 2) {
                suhuakhir = suhuawal;
            } else if (ak.getSelectedItemPosition() == 3) {
                suhuakhir = ((suhuawal - 32) * 5 / 9) + 273;
            }
        } else if (aw.getSelectedItemPosition() == 3) {
            if (ak.getSelectedItemPosition() == 0) {
                suhuakhir = suhuawal - 273;
            } else if (ak.getSelectedItemPosition() == 1) {
                suhuakhir = (suhuawal - 273) * 4 / 5;
            } else if (ak.getSelectedItemPosition() == 2) {
                suhuakhir = (suhuawal - 273) * 9 / 5 + 32;
            } else if (ak.getSelectedItemPosition() == 3) {
                suhuakhir = suhuawal;
            }
        }
        sakhir.setText(String.valueOf(suhuakhir));
    }

}
