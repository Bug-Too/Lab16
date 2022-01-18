public class Follower1 implements Observer<String>{

    @Override
    public void notify(String event) {
        System.out.println("Message: " + event + "\nFollower1 replied: สวัสดีคับผมอยู่ ม.ช้างกะทิ ");
    }
}
