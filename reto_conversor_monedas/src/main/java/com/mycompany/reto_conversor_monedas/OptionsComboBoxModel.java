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
public class OptionsComboBoxModel extends AbstractListModel<String> implements ComboBoxModel<String> {

    private ArrayList<String> options = new ArrayList<>(Arrays.asList("Moneda", "Longitud", "Temperatura", "Peso"));
    private String selectedItem;

    @Override
    public int getSize() {
        return options.size();
    }

    @Override
    public String getElementAt(int index) {
        return options.get(index);
    }

    @Override
    public void setSelectedItem(Object item) {
        selectedItem = (String) item;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }

}
