package construct;

public class ConstructMain1 {

    public static void main(String[] args) {
        MemberConstruct number1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct number2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {number1, number2};

        for (MemberConstruct s: members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
