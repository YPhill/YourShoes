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

    String titulo[] = {"Tênis Nike Air Force",
            "Downshifter 12",
            "Air Jordan XXXVII",
            "Air Zoom Superfly 9"};
    String desc[] = {"Com uma estética envelhecida e cores clássicas, o original do basquete ganha uma transformação vintage. ",
            "Desenvolvido em material leve e resistente, possui cabedal têxtil respirável e por isso compre um número acima do que costuma usar.",
                "O AJ mais recente tem tudo a ver com decolagens e aterrissagens, com várias unidades Air para tirá-lo do chão.",
            "A chuteira de campo Zoom Superfly 9 Academy KM FG/MG possui a tecnologia Air Zoom que fornece um nível adicional de amortecimento."};
    String preco[] = {"R$ 899,99",
                    "R$ 284,99",
                    "R$ 1299,99",
                    "R$ 469,00"};
    int imagem[] = {R.drawable.tenis1,
            R.drawable.airmaxd,
            R.drawable.airjordandap,
            R.drawable.chut};
    String star[] = {"4.5", "5.0", "1.0", "3.5"};




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
            return imagem.length;
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
            idTitulo = v.findViewById(R.id.idTituloM);
            idPreco = v.findViewById(R.id.idPrecoM);
            idStar = v.findViewById(R.id.idStarM);
            idDesc = v.findViewById(R.id.idDescM);

            idImg.setImageResource(imagem[i]);
            idTitulo.setText(titulo[i]);
            idPreco.setText(preco[i]);
            idStar.setText(star[i]);
            idDesc.setText(desc[i]);

            return v;

        }
    }



}