import java.awt.Desktop;
import java.net.URI;

public class song {
    public static void main(String[] args){
        String[] songLines = {
            "Sochun te milne te bolenga ki,",
            "tu hi ghazal meri tu shayri",
            "Vekdhdi tainu mai vaari kyou jau?",
            "eid da chanda tu mai chaandni",
            "ishq-e di galliyan vich khoya ye dil ve",
            "aas lgaye ki jaaye tu mil ve",
            "Kol mere aake beja ve yaara",
            "tu hi to dil mera tu dildaara",
            "Dooron Dooron kyon ?",
            "vekhe mainu soneya",
            "waha tu yaha mai",
        };
        try {
            //1.music File Load 
            //File musicFile = new File(dooron_dooron.mp4);
            String url = "https://www.youtube.com/shorts/i4Ds8d2q5F8?feature=share";
            Desktop.getDesktop().browse(new URI(url));

            Thread.sleep(9000); // Wait for 5 seconds to allow the music to start
            //AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicFile);
            //Clip clip = AudioSystem.getClip();
            //clip.open(audioStream);

            //2.Play the music
            //clip.start();
            System.out.println("Playing song...");

            for(String line : songLines){
                System.out.println(line);
                Thread.sleep(4000); // Pause for 2 seconds between lines
            }

            //while (clip.isRunning()){
            //    Thread.sleep(100);
            //}
            //System.out.println("Song ended.");
        } catch (Exception e) {
            System.out.println("Error: Sound file madhe kahi tari chuk ahe!");
            e.printStackTrace();
        }

    }
    
}
