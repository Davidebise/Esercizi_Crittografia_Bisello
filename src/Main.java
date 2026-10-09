import static java.lang.IO.println;
import static java.lang.IO.readln;

void main(){
    String method;
    do{
        method=readln("Inserire metodo cifratura(Cesare,Rot13,Vigenere):");
    }while(!method.equalsIgnoreCase("cesare") && !method.equalsIgnoreCase("rot13") && !method.equalsIgnoreCase("vigenere"));

    String mode;

    do{
        mode=readln("Inserire modalità cifratura(c/d):");
    }while(!mode.equalsIgnoreCase("c") && !mode.equalsIgnoreCase("d"));

    switch(method.toLowerCase()){
        case "cesare":
            try{
                int key;
                key=Integer.parseInt(readln("Inserire numero chiave:"));
                String message=readln("Inserire messaggio da cifrare/decifrare:");
                if(mode.equalsIgnoreCase("c"))
                    println(Cesare.Cifra(message,key));
                else
                    println(Cesare.Decifra(message,key));
            }
            catch(Exception e){
                println("Errore:"+e.getMessage());
            }
            break;
        case "rot13":
            try{
                String message=readln("Inserire messaggio da cifrare/decifrare:");
                if(mode.equalsIgnoreCase("c"))
                    println(Cesare.Cifra(message,13));
                else
                    println(Cesare.Decifra(message,13));
            }
            catch(Exception e){
                println("Errore:"+e.getMessage());
            }
            break;
            case "vigenere":
                try{
                    String key;
                    do{
                        key=readln("Inserire parola chiave:");
                    }while(key.isEmpty());
                    String message=readln("Inserire messaggio da cifrare/decifrare:");
                    if(mode.equalsIgnoreCase("c"))
                        println(Vigenere.Cifra(message,key));
                    else
                        println(Vigenere.Decifra(message,key));
                }
                catch(Exception e){
                    println("Errore:"+e.getMessage());
                }
                break;

    }
}
