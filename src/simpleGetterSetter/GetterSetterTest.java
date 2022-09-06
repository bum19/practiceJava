package simpleGetterSetter;

public class GetterSetterTest {
    public static void main(String[] args) {
        Worker w = new Worker();
        w.setName("김코딩");
        w.setAge(30);
        w.setId(5);

        String name = w.getName();
        System.out.println("근로자의 이름은 "+name);

        int age = w.getAge();
        System.out.println("근로자의 나이는 "+age);

        int Id = w.getId();
        System.out.println("근로자의 ID는 "+Id);
    }
}

class Worker{
    private String name;
    private int age;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

