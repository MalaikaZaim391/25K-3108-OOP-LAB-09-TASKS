interface RecordedCourse {
    default void playVideo() {
        System.out.println("Playing recorded video...");
    }
}

interface LiveCourse {
    default void playVideo() {
        System.out.println("Streaming live session...");
    }
}

abstract class Course {
    abstract void startSession();
}

class HybridCourse extends Course implements RecordedCourse, LiveCourse {

    @Override
    void startSession() {
        System.out.println("Hybrid course session started.");
    }

    // resolving conflict
    @Override
    public void playVideo() {
        System.out.println("Hybrid Course decides video mode:");
        RecordedCourse.super.playVideo();
        LiveCourse.super.playVideo();
    }
}

public class Q2 {
    public static void main(String[] args) {
        HybridCourse hc = new HybridCourse();
        hc.startSession();
        hc.playVideo();
    }
}