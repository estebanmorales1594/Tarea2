package bancobac;

/**
 *
 * @author Esteban
 */
import java.util.Properties; 
import javax.mail.*; 
import javax.mail.internet.InternetAddress; 
import javax.mail.internet.MimeMessage; 

public class EnviarCorreo4 {
    final String Cuenta; 
    final String Contraseña; 
    final String servidorSMTP; 
    final String puertoEnvio; 
    
    public EnviarCorreo4(){
        this.Cuenta = "estructurasdatosjje@gmail.com"; 
        this.Contraseña = "datosjje"; 
        this.servidorSMTP = "smtp.gmail.com"; 
        this.puertoEnvio = "465";
    }
        

    public  void EnviarCorreo(String Cliente, String asunto, String Correo) throws MessagingException { 


        Properties propiedades = new Properties(); 
        propiedades.put("mail.smtp.user", Cuenta); 
        propiedades.put("mail.smtp.host", servidorSMTP); 
        propiedades.put("mail.smtp.port", puertoEnvio); 
        propiedades.put("mail.smtp.starttls.enable", "true"); 
        propiedades.put("mail.smtp.auth", "true"); 
        propiedades.put("mail.smtp.socketFactory.port", puertoEnvio); 
        propiedades.put("mail.smtp.socketFactory.class", 
                "javax.net.ssl.SSLSocketFactory"); 
        propiedades.put("mail.smtp.socketFactory.fallback", "false"); 

        SecurityManager seguridad = System.getSecurityManager(); 

     
            Authenticator autorizar = new EnviarCorreo4.autentificadorSMTP(); 
            Session sesion = Session.getInstance(propiedades, autorizar); 
            // session.setDebug(true); 

            MimeMessage msg = new MimeMessage(sesion); 
            msg.setText(Correo); 
            msg.setSubject(asunto); 
            msg.setFrom(new InternetAddress(Cuenta)); 
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(Cliente)); 
            Transport.send(msg); 
       

    } 

    private class autentificadorSMTP extends javax.mail.Authenticator { 
        @Override
        public PasswordAuthentication getPasswordAuthentication() { 
            return new PasswordAuthentication(Cuenta, Contraseña); 
        } 
    } 
 

    public static void main(String[] args) throws MessagingException {
        
        
        EnviarCorreo4 Envia = new EnviarCorreo4();
        Envia.EnviarCorreo("jose12.13@hotmail.com", "hola", "cuek");
        


        System.out.println("Mensaje Enviado"); 
    } 
}

