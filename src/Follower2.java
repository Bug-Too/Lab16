public class Follower2 implements Observer<String>{

    @Override
    public void notify(String event) {
        System.out.println("Message: " + event + "\nFollower2 replied: ดีคร่าาาา รักพ่อคร่ะ ใครจ๊วบจาบพ่ออินบ๊อกมาคร๊ะ");
    }
}
