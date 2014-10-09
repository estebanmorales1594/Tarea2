package bancobac;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class EnviarCorreo2 {
    private final Properties propiedades = new Properties();
    private Session sesion;
    
    private void iniciar() {
        propiedades.put("mail.smtp.host", "smtp.gmail.com");
        propiedades.put("mail.smtp.starttls.enable", "true");
        propiedades.put("mail.smtp.port", 587);
        propiedades.put("mail.smtp.mail.sender", "estructurasdatosjje@gmail.com");
        propiedades.put("mail.smtp.password", "datosjje");
        propiedades.put("mail.smtp.user", "estructurasdatosjje@gmail.com");
        propiedades.put("mail.smtp.auth", "true");
        sesion = Session.getDefaultInstance(propiedades);
    }
    public void Enviar(String cliente,String asunto, String correo) {
       iniciar();
       try {
            MimeMessage message = new MimeMessage(sesion);
            message.setFrom(new InternetAddress((String) propiedades.get("mail.smtp.mail.sender")));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(cliente));
            message.setSubject(asunto);
            message.setText(correo);
            message.setContent(correo, "");
            Transport t = sesion.getTransport("smtp");
            t.connect((String) propiedades.get("mail.smtp.user"), (String) propiedades.get("mail.smtp.password"));
            t.sendMessage(message, message.getAllRecipients());
            t.close();
        } catch (MessagingException e) {
            return;
        }
    }
    
     public static void main(String[] args){
        EnviarCorreo2 mail = new EnviarCorreo2();
        mail.Enviar("estebanmorales1594@hotmail.com","Esto es una prueba","Este correo fue enviado usando JavaMail");
    }
}
