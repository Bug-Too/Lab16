public class Follower3 implements Observer<String>{

    @Override
    public void notify(String event) {
        System.out.println("Message: " + event + "\nFollower3 replied: เอฟซีม๊วกกกก ");
    }
}
