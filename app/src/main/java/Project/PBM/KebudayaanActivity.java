package Project.PBM;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import Project.PBM.model.Kebudayaan;
import Project.PBM.adapter.KebudayaanAdapter;

public class KebudayaanActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KebudayaanAdapter adapter;
    private ArrayList<Kebudayaan> kebudayaanArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebudayaan);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_kebudayaan);

        adapter = new KebudayaanAdapter(kebudayaanArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(KebudayaanActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }
    void addData(){
        kebudayaanArrayList = new ArrayList<>();
        kebudayaanArrayList.add(new Kebudayaan("Tari Piring", "Tarian", "dimana jumlah penari biasanya bersifat ganjil antara 3-7 orang, penari pun bisa laki-laki atau perempuan, bahkan bisa berpasang-pasangan.\n" +
                "\n" +
                "Awalnya tarian ini dibuat untuk ucapan terima kasih dari masyarakat setempat karena hasil panennya melimpah.\n" +
                "\n" +
                "Ritual pun akan dilakukan dengan membawa sesajen. Namun ketika agama Islam masuk, ritual itu dijadikan sebuah tarian yang bersifat menghibur saja."));
        kebudayaanArrayList.add(new Kebudayaan("Dendeng", "daging", "daging yang dipotong tipis menjadi serpihan yang lemaknya dipangkas, dibumbui dengan saus asam, asin atau manis dengan dikeringkan dengan api kecil atau diasinkan dan dijemur. Hasilnya adalah daging yang asin dan setengah manis dan tidak perlu disimpan di lemari es. Dendeng adalah contoh makanan yang diawetkan."));
        kebudayaanArrayList.add(new Kebudayaan("Gulai Ayam", "ayam", "masakan berbahan baku daging ayam, atau sayuran seperti nangka muda dan daun singkong, yang diolah dalam kuah bumbu rempah yang bercita rasa gurih. Ciri khas gulai adalah bumbunya yang kaya rempah antara lain kunyit, ketumbar, lada, lengkuas, jahe, cabai merah, bawang merah, bawang putih, adas, pala, serai, kayu manis dan jintan yang dihaluskan, dicampur, kemudian dimasak dalam santan."));
        kebudayaanArrayList.add(new Kebudayaan("Gulai Ikan", "ikan", "adalah masakan berbahan baku aneka ikan, sayuran seperti nangka muda dan daun singkong, yang diolah dalam kuah bumbu rempah yang bercita rasa gurih."));
    }
    
}
