package simplePolymorphism;

class Friend{
    public void friendInfo(){
        System.out.println("나는 당신의 친구입니다.");
    }
}

class Boyfriend extends Friend{
    public void friendInfo(){
        System.out.println("나는 당신의 남자친구입니다.");
    }
}

class Girlfriend extends Friend{
    public void friendInfo(){
        System.out.println("나는 당신의 여자친구입니다.");
    }
}
public class FriendTest {
    public static void main(String[] args){
        Friend friend = new Friend();
        Boyfriend boyfriend = new Boyfriend();
        Friend girlfriend = new Girlfriend();

        friend.friendInfo();
        boyfriend.friendInfo();
        girlfriend.friendInfo();
    }
}
