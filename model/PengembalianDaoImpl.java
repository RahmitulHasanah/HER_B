/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HER_B.model;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author RIMTECH COMPUTER
 */
public class PengembalianDaoImpl implements PengembalianDao {
    List<Pengembalian> data = new ArrayList<>();

    public PengembalianDaoImpl() {
        data.add(new Pengembalian("1111", "B001", "2023-01-01", "2023-01-03"));
    }
    
    public void save(Pengembalian pengembalian){
        data.add(pengembalian);
    }
    public void update(int index, Pengembalian pengembalian){
        data.set(index, pengembalian);
    }
    public void delete (int index){
        data.remove(index);
    }
    public Pengembalian getPengembalian(int index){
        return data.get(index);
    }
    
    public List<Pengembalian> getAllPengembalian(){
        return data;
    }
}
