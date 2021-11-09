package com.company;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final ObjectMapper JSON_MAPPER = new ObjectMapper();
    public static void main(String[] args) throws IOException {
        // write your code here
        Producto prod = new Producto(100, "silla", 200.0, "silla de madera", "marron", 5, "muebles");
        System.out.println(prod.getDescripcion());

        System.out.println("Ingrese una opción");
        System.out.println("1 -  escribir json");
        System.out.println("2 -  leer json");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion){
        case 1:
            GenerarJson(prod);
        break;

        case 2:
            LeerJson();
        break;
        }



    }
    private static void GenerarJson(Producto producto) throws IOException {
        JSON_MAPPER.writeValue(new File("/home/juan/Documentos/producto.json"), producto);
    }

    private static void LeerJson() throws IOException {
        Producto producto = JSON_MAPPER.readValue(new File("/home/juan/Documentos/producto.json"), Producto.class);
        System.out.println(producto);
    }
}
