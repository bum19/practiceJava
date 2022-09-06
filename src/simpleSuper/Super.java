package simpleSuper;

public class Super {
    public static void main(String[] args) {
        Lower l = new Lower();
        l.calNum();
    }
}

class Upper {
    Upper(){
        System.out.println("Upper constructor executed.");
    }
    int count = 20; //super.count
}

class Lower extends Upper{
    int count = 15; // this.count
    Lower(int num){
        System.out.println("Lower constructor5 executed");
    }
    Lower(){
        //super();
        this(5);
        System.out.println("Lower constructor executed.");
    }

    void calNum(){
        System.out.println("count = "+count);
        System.out.println("this.count = "+this.count);
        System.out.println("super.count = "+super.count);
    }
}