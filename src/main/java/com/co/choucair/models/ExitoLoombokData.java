package com.co.choucair.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class ExitoLoombokData {

    String nombre;
    int cantidad;
    double precioUnitario;



    public static List<ExitoLoombokData> setData(DataTable table){
        List<ExitoLoombokData> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> map : mapList) {
            data.add(new ObjectMapper().convertValue(map, ExitoLoombokData.class));
        }
        return data;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getpPrecioUnitario() {
        return precioUnitario;
    }

    public void setprecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }


}
