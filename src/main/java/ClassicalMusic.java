public class ClassicalMusic implements Music {

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    private void doInit() {
        System.out.println("Initialize ClassicalMusic Bean");
    }

    private void doDestroy() {
        System.out.println("Destroy ClassicalMusic Bean");
    }

    @Override
    public String getSong() {
        return "Caprice No.24";
    }
}
