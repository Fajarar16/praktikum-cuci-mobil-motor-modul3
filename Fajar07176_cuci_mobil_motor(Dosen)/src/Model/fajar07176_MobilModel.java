package Model;

import Entity.Fajar07176_MobilEntity;
import java.util.ArrayList;
public class fajar07176_MobilModel implements fajar07176_ModelInterfaces{
    private ArrayList <Fajar07176_MobilEntity> mobilEntityArrayList;
    public fajar07176_MobilModel(){
        mobilEntityArrayList = new ArrayList<Fajar07176_MobilEntity>();
    }
    public void insertMobil07176(Fajar07176_MobilEntity mobil){
        mobilEntityArrayList.add(mobil);
    }
    public int size(){
       return mobilEntityArrayList.size();
    }
    public ArrayList<Fajar07176_MobilEntity> getMobil(){
       return mobilEntityArrayList;
    }
    
    @Override
    public void hapus(int index) {
        mobilEntityArrayList.remove(index);    
    }
    @Override
    public void update(int index, String data, String ubah) {
        switch (ubah) {

            case "nomor":
                mobilEntityArrayList.get(index).setNomorMobil07176(data);
                break;
            case "nama":
                mobilEntityArrayList.get(index).setNamaPemilikMobil07176(data);
                break;
            case "merek":
                mobilEntityArrayList.get(index).setfajar07176_merekmobil(data);
                break;
            case "warna":
                mobilEntityArrayList.get(index).setfajar07176_warnamobil(data);
                break;
        }
    }
}

