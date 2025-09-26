class Course {
    String courseName;
    int duration; 

    Course() {
        this.courseName = "Java FullStack";
        this.duration = 6;
    }

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    String getCourseName() {
        return courseName;
    }

    void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    int getDuration() {
        return duration;
    }

    void setDuration(int duration) {
        this.duration = duration;
    }

    void display() {
        System.out.println("Course Name: " +courseName);
        System.out.println("Duration   : " +duration +" weeks");
    }
} // class Course ends here


// OnlineCourse Class
class OnlineCourse extends Course {
    String platform;
    boolean recorded;

    OnlineCourse() {
        super();
        this.platform = "Udemy";
        this.recorded = true;
        System.out.println("OnlineCourse Default Constructor");
    }

    OnlineCourse(String courseName, int duration, String platform, boolean recorded) {
        super(courseName, duration);
        this.platform = platform;
        this.recorded = recorded;
        System.out.println("OnlineCourse Parameterized Constructor");
    }

    String getPlatform() {
        return platform;
    }

    void setPlatform(String platform) {
        this.platform = platform;
    }

    boolean isRecorded() {
        return recorded;
    }

    void setRecorded(boolean recorded) {
        this.recorded = recorded;
    }

    void display() {
        super.display();
        System.out.println(">>Platform : " + platform);
        System.out.println(">>Recorded : " + (recorded ? "Yes" : "No"));
    }
} // class OnlineCourse ends here


class OfflineCourse extends Course {
    String location;
    int maxStudents;

    OfflineCourse() {
        super();
        this.location = "Main Campus";
        this.maxStudents = 30;
        System.out.println("OfflineCourse Default Constructor");
    }

    OfflineCourse(String courseName, int duration, String location, int maxStudents) {
        super(courseName, duration);
        this.location = location;
        this.maxStudents = maxStudents;
        System.out.println("OfflineCourse Parameterized Constructor");
    }

    String getLocation() {
        return location;
    }

    void setLocation(String location) {
        this.location = location;
    }

    int getMaxStudents() {
        return maxStudents;
    }

    void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    void display() {
        super.display();
        System.out.println(">>Location    : "+location);
        System.out.println(">>Max Students: "+maxStudents);
    }
}// class OfflineCourse ends here


class Workshop extends Course {
    String topic;
    int hours;

    Workshop() {
        super();
        this.topic = "General";
        this.hours = 4;
        System.out.println("Workshop Default Constructor");
    }

    Workshop(String courseName, int duration, String topic, int hours) {
        super(courseName, duration);
        this.topic = topic;
        this.hours = hours;
        System.out.println("Workshop Parameterized Constructor");
    }

    String getTopic() {
        return topic;
    }

    void setTopic(String topic) {
        this.topic = topic;
    }

    int getHours() {
        return hours;
    }

    void setHours(int hours) {
        this.hours = hours;
    }

    void display() {
        super.display();
        System.out.println(">>Topic : " +topic);
        System.out.println(">>Hours : " +hours);
    }
} // Workshop ends


class TestCourse {
    public static void main(String[] args) {
        Course c1 = new Course();
        c1.display();
        System.out.println();

        c1= new OnlineCourse("Core Java", 1, "FBS", true);
        c1.display();
        System.out.println();

        c1= new OfflineCourse("Data Science", 8, "FBS",200);
        c1.display();
        System.out.println();

//        Workshop w1 = new Workshop("AI Workshop", 1, "Machine Learning", 5);
//        w1.display();
    }
}
