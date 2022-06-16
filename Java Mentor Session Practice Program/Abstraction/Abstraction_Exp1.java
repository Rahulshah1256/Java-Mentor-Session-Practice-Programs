abstract class Language {
    abstract void display();
    public void displayLanguage(){
        System.out.println("Programming language");
    }
}
    class Java extends Language {
        void display() {
            System.out.println("Java is a programming language");
        }
    }
        class Python extends Language{
            void display() {
                System.out.println("Python is a programming language");
            }
   }
       class Abstraction_Exp1{
        public static void main(String[] args) {
            Java obj1 = new Java ();
            obj1.display();
            obj1.displayLanguage();
            Python obj2=new Python();
            obj2.display();
            obj2.displayLanguage();
        }
    }

