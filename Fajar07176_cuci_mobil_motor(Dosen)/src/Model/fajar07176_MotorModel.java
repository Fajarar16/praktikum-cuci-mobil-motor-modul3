package Model;

import Entity.Fajar07176_MotorEntity;
import java.util.ArrayList;
public class fajar07176_MotorModel implements fajar07176_ModelInterfaces{
    private ArrayList <Fajar07176_MotorEntity> motorEntityArrayList;
    public fajar07176_MotorModel(){
        motorEntityArrayList = new ArrayList<Fajar07176_MotorEntity>();
    }
    public void insertMotor07176(Fajar07176_MotorEntity motor){
        motorEntityArrayList.add(motor);
    }
    public int size(){
        return motorEntityArrayList.size();
    }
    public ArrayList<Fajar07176_MotorEntity> getMotor() {
        return motorEntityArrayList;
    }
    @Override
    public void hapus(int index) {
        motorEntityArrayList.remove(index);
    }
    @Override
    public void update(int index, String data, String ubah) {         
        switch (ubah) {
            case "nomor":
                motorEntityArrayList.get(index).setNomorkendaraan07176(data);
                break;
            case "nama":
                motorEntityArrayList.get(index).setNamaPemilik07176(data);
                break;
            case "merek":
                motorEntityArrayList.get(index).setfajar07176_merekmotor(data);
                break;
            case "warna":
                motorEntityArrayList.get(index).Setfajar07176_warnamotor(data);
                break;
        }
    }
}