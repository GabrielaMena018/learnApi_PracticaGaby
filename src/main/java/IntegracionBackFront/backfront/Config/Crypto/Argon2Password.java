package IntegracionBackFront.backfront.Config.Crypto;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.stereotype.Service;

@Service
public class Argon2Password {
    //Configuracion recomendada para argon 2ID
    private  static final int ITERATIONS = 10;
    private  static final int MEMORY = 32768;
    private static final int  PARALLELISM = 2;

    //Crear una instancia de argon 2id
    private Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);

    public  String EncryptPassword(String password){
        return argon2.hash(ITERATIONS, MEMORY, PARALLELISM, password);
        //$argon2id$v=19$m=32768,t=10,p=2$VFBybmlucHY4SG9aVFRRRw$3Cs+JTIsSQWmpvxjTM8V3Q
    }

    public boolean verifyPassword(String passwordBD, String password){
        return  argon2.verify(passwordBD, password);
    }
}
