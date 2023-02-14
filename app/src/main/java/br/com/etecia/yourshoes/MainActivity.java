package br.com.etecia.yourshoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView idLista;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idLista = findViewById(R.id.idLista);

        MyAdapter adapter = new MyAdapter();

        idLista.setAdapter(adapter);


    }

    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            ImageView idImg;

            TextView idTitulo, idPreco, idDesc, idStar;

            View v = (getLayoutInflater().inflate(R.layout.model_shoes, null));

            idImg = v.findViewById(R.id.idImgM);
            idTitulo = v.

            return v;

        }
    }



}