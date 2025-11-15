package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVoluem();

        speaker.volumeUp();
        speaker.showVoluem();

        speaker.volumeUp();
        speaker.showVoluem();

        System.out.println("volume 필드 직접 접근 수정");
        //speaker.volume = 200;
        speaker.showVoluem();
    }
}
