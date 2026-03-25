public class HelloApp {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder(); 
        String names = null;
        for (String name : args){
            nameBuilder.append(name).append(", ");
            if (nameBuilder.length() > 0){
                names = nameBuilder.substring(0, nameBuilder.length() - 2);
            }
            else{
                names = "world";
            }
        }
        System.out.println("Hello, " + names + "!");
    }
}