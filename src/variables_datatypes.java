public class variables_datatypes {
    public static void main(String[] args) {
        String text = "Juan Dela Cruz";
        int number = 100;
        float decimal = 99.9f;
        char single_character = 'M';
        boolean true_or_false = true;

        System.out.println(text);
        System.out.println(number);
        System.out.println(decimal);
        System.out.println(single_character);
        System.out.println(true_or_false);

        String firstname = "Michael ";
        String lastname = "Banaria";
        String fullname = firstname + lastname;

        System.out.println(fullname);

        String purok = "Zone 1 ", barangay = "San Juan ", municipality = "Baao";
        System.out.print(purok + barangay + municipality);
    }
}
