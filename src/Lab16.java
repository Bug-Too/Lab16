public class Lab16 {
    public static void main(String[] args) {
        TwitterFeed feed = new TwitterFeed();
        Observer<String> follower1 = new Follower1();
        Observer<String> follower2= new Follower2();
        Observer<String> follower3 = new Follower3();

        feed.subscribe(follower1);
        feed.subscribe(follower2);
        feed.subscribe(follower3);

        feed.publishTweet("ไงงงงงงงงง (;");
        System.out.println();
        feed.publishTweet("รักพ่อ ร.10 คือ ที่สุดดด");
        System.out.println();
        feed.publishTweet("หล่อสุดดดดดดดดด");
        System.out.println();
    }
}


//ขอบคุณ ธนดล ที่ช่วย
//ที่มาวิธีคิด preorder มาจาก Geeksforgeeks
