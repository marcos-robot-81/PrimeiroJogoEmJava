package ites.BancoDeItes;

import ites.Iten;
import ites.itesATK.ItenDeATK;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class BancoItes {
    public BancoItes() {
        String file = "ItensDeAtk.json";


        InputStream i = getClass().getResourceAsStream(file);
        Scanner scan = new Scanner(i);

         ArrayList<Iten> lista = new ArrayList<>();

        while (scan.hasNextLine()){
            String linhaDeDados = scan.nextLine();
            String nome;
            String tipo;
            String valor;
            int indece1 = linhaDeDados.indexOf("nomeIten");
            int indece2 = linhaDeDados.indexOf("tipo");
            int indece3 = linhaDeDados.indexOf("atkBatkBonos");

            if(indece1 > 4 || indece2 > 20) {
                ItenDeATK iten = new ItenDeATK(
                        linhaDeDados.substring(indece1 +13, indece2 -4),
                        linhaDeDados.substring(indece2 +8,indece3 -4),
                        Float.parseFloat (linhaDeDados.substring(indece3 +15, linhaDeDados.indexOf("}") -1))
                        );
                System.out.println(iten.getNomeIten());
                lista.add(iten);


            }
        }





        /**
        try {
            InputStream inputStream = getClass().getResourceAsStream(file);
            if (inputStream == null) {
                throw new FileNotFoundException("Recurso não encontrado: "+file);
            }
            Scanner scan = new Scanner(inputStream);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
            scan.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Erro ao abrir o recurso: " + e.getMessage(), e);
        } **/
    }

}