public class SistemaMedida {
    public static void main(String[] args) {
        String sigla1 = "P";

            //TRADICIONAL
        if (sigla1 == "P")
            System.out.println("PEQUENO");

        else if (sigla1 == "M")
            System.out.println("MEDIO");

        else if (sigla1 == "G")
            System.out.println("GRANDE");

        else
            System.out.println("INDEFINIDO");
            
        
            //SWITCH CASE
        String sigla2 = "M";
        switch (sigla2) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            } 
        
            default:
                System.out.println("INDEFINIDO");
        }
    }
    
}
