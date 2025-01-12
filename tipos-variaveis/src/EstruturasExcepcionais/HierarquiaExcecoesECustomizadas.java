package EstruturasExcepcionais;

import java.text.NumberFormat;
import java.text.ParseException;

public class HierarquiaExcecoesECustomizadas {
    public static void main(String[] args) {
        // Number valor = Double.valueOf("a1.75");
        // System.out.println(valor);
        

        Number valor2;
        try {
            
            valor2 = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor2);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        
    }
    
}
