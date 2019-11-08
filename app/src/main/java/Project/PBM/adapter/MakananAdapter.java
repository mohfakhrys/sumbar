package Project.PBM.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import Project.PBM.R;
import Project.PBM.model.Makanan;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.MakananViewHolder> {


    private ArrayList<Makanan> dataList;

    public MakananAdapter(ArrayList<Makanan> dataList) {
        this.dataList = dataList;
    }

    @Override
    public MakananViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_makanan, parent, false);
        return new MakananViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MakananViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNpm.setText(dataList.get(position).getJenis());
        holder.txtNoHp.setText(dataList.get(position).getPenjelasan());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MakananViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNpm, txtNoHp;

        public MakananViewHolder(View itemView) {
            super(itemView);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_kebudayaan);
            txtNpm = (TextView) itemView.findViewById(R.id.txt_jenis_kebudayaan);
            txtNoHp = (TextView) itemView.findViewById(R.id.txt_penjelasan_kebudayaan);
        }
    }
}
