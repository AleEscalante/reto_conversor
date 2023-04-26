/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto_conversor_monedas;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Alejandro
 */
public class UnitsComboBoxModel extends AbstractListModel<String> implements ComboBoxModel<String>{
    private ArrayList<String> units = new ArrayList<>();
    private String selectedItem;

    @Override
    public int getSize() {
        return units.size();
    }

    @Override
    public String getElementAt(int index) {
        return units.get(index);
    }

    @Override
    public void setSelectedItem(Object item) {
        selectedItem = (String) item;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }

    public ArrayList<String> getUnits() {
        return units;
    }

    public void setUnits(ArrayList<String> units) {
        this.units = units;
    }
      
}
