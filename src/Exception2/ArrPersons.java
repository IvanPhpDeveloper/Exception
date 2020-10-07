package Exception2;

public class ArrPersons {
    public static void main(String[] args) {
        String [] people={"John","Michael","Tommy","Andrew"};
        try{
            String  person=people[5];
            System.out.println(person);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
