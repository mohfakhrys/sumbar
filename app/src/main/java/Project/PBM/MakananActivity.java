package Project.PBM;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import Project.PBM.model.Makanan;
import Project.PBM.adapter.MakananAdapter;

public class MakananActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MakananAdapter adapter;
    private ArrayList<Makanan> makananArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_makanan);

        adapter = new MakananAdapter(makananArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MakananActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        makananArrayList = new ArrayList<>();
        makananArrayList.add(new Makanan("Rendang", "dagin", "masakan daging dengan bumbu rempah-rempah yang berasal dari Minangkabau. Masakan ini dihasilkan dari proses memasak yang dipanaskan berulang-ulang menggunakan santan sampai kuahnya kering sama sekali. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga yang tinggal hanyalah potongan daging berwarna hitam pekat. Dalam suhu ruangan, rendang dapat bertahan hingga berminggu-minggu. Rendang yang dimasak dalam waktu yang lebih singkat dan santannya belum mengering disebut kalio, berwarna cokelat terang keemasan."));
        makananArrayList.add(new Makanan("Dendeng", "daging", "daging yang dipotong tipis menjadi serpihan yang lemaknya dipangkas, dibumbui dengan saus asam, asin atau manis dengan dikeringkan dengan api kecil atau diasinkan dan dijemur. Hasilnya adalah daging yang asin dan setengah manis dan tidak perlu disimpan di lemari es. Dendeng adalah contoh makanan yang diawetkan."));
        makananArrayList.add(new Makanan("Gulai Ayam", "ayam", "masakan berbahan baku daging ayam, atau sayuran seperti nangka muda dan daun singkong, yang diolah dalam kuah bumbu rempah yang bercita rasa gurih. Ciri khas gulai adalah bumbunya yang kaya rempah antara lain kunyit, ketumbar, lada, lengkuas, jahe, cabai merah, bawang merah, bawang putih, adas, pala, serai, kayu manis dan jintan yang dihaluskan, dicampur, kemudian dimasak dalam santan."));
        makananArrayList.add(new Makanan("Gulai Ikan", "ikan", "adalah masakan berbahan baku aneka ikan, sayuran seperti nangka muda dan daun singkong, yang diolah dalam kuah bumbu rempah yang bercita rasa gurih."));

    }
}
