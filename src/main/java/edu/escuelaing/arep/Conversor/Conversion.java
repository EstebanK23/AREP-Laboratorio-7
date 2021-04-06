package edu.escuelaing.arep.Conversor;

import com.google.gson.Gson;

public class Conversion {
    public Conversion(){}

    public static String SalidaJson(Double number){
        Gson archivo = new Gson();
        String result = "{\"Celsius\":"+number+"}";
        return archivo.toJson(result);
    }

    public String Conversor(Double grados){
        Double result = (grados-32)*(5/9);
        return SalidaJson(result);
    }
}
