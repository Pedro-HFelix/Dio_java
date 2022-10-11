public class MinhaClasse{
    public static void main(String [] args) {
        System.out.println("Bem vindo");
     String primeiroNome = "Priscila";
     String segundoNome = "Silva";
      
     String nomeCompleto = nomeCompleto(primeiroNome,segundoNome); 
        
     System.out.println(nomeCompleto);
    }
    
public static String nomeCompleto(String primeiroNome, String segundoNome){
return "Resultado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
}      
   
}