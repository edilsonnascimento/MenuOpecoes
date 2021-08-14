package br.utfpr.menuopecoes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layoutMain);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_opcoes, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuItemSalvar:
                mostrar(getString(R.string.salvar) + getString(R.string.fui_clicado));
                break;
            case R.id.menuItemExcluir:
                mostrar(getString(R.string.excluir) + getString(R.string.fui_clicado));
                break;
            case R.id.menuItemAzul:
                item.setChecked(true);
                layout.setBackgroundColor(Color.BLUE);
                break;
            case R.id.menuItemVermelho:
                item.setChecked(true);
                layout.setBackgroundColor(Color.RED);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

    public void usarDados(MenuItem item){
        item.setChecked(!item.isChecked());
    }

    private void mostrar(String mensagem){
        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();
    }
}