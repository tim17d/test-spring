import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application_context.xml");
        ClassicalMusic music1 = context.getBean("classicalMusicBean", ClassicalMusic.class);
        ClassicalMusic music2 = context.getBean("classicalMusicBean", ClassicalMusic.class);
        ClassicalMusic music3 = context.getBean("classicalMusicBean", ClassicalMusic.class);

//        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
//        player.playMusic(2);
        context.close();
    }
}