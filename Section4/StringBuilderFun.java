public class StringBuilderFun {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Rohit");

        sb.append(" is Amazing");
        System.out.println(sb);

        sb.insert(6," Pandey");
        System.out.println(sb);

        sb.replace(16,23,"Awesome ");
        System.out.println(sb);

        sb.delete(16,23);
        System.out.println(sb);

        sb.toString();
    }
}