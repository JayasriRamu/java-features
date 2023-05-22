interface Drawable{
    public void draw();
}

public class Lambda_with_out {
    public static void main(String args[]){
        int width=10;

        //without lambda, Drawable implementation using anonymous class
        Drawable d=new Drawable(){
            public void draw(){System.out.println("Drawing "+width);
        }
        public void draw1(){System.out.println("Drawing "+width);
        }
        };
        d.draw();

        //with lambda
        Drawable d2=()->{
            System.out.println("Drawing "+width);
        };
        d2.draw();
    }
}
