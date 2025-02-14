/*
* This class is going to demonstrate how to simply use Regular Expressions
* Regular Expression (short regex) is a string that describes a pattern for matching a set of strings
* */
public class RegExp {
    public static void main(String[] args) {
//        matches();
//        replace();
//        split();
        midtermRegex();
    }

    private static void split() {
        // The following statement splits the string into an array of strings delimited
        // by punctuation marks
        String languages = "Java,C?C#,C++:Python.Javascript";
        String[] tokens = languages.split("[.,:;?]");
        System.out.println("Languages before split: " + languages);
        System.out.println("Languages after splitting");
        for (String token: tokens)
            System.out.println(token);
    }

    private static void replace() {
        // replaceAll and replaceFirst methods
        // the following statement returns a new string that
        // replaces & or ! or ? in Java&C!C++?Python with the string and
        String s = "Java&C!C++?Python".replaceAll("[&!?]", " and ");
        String s2 = "Java&C!C++?Python".replaceFirst("[&!?]", " and ");
        System.out.println(s);
        System.out.println(s2);
    }

    private static void matches() {
        /*
        matches method
        * */
        // Today.*  describes a string pattern that begins with Today
        // followed by any zero or more characters
        System.out.println("Today is a good day to ...".matches("Today.*"));
        System.out.println("Today".matches("Today.*"));

        String[] creditCards = {"4404-0244-4444-4444", "4404-244-4444-4444", "4404-0244-444-4444"};
        // In creditCardFormat variable, \\d represents a single digit,
        // and \\d{4} represents four digits.
        String creditCardFormat = "\\d{4}-\\d{4}-\\d{4}-\\d{4}";
        for(String creditCard: creditCards)
            System.out.println("Credit card " + creditCard +
                    (creditCard.matches(creditCardFormat) ? " is correct" : " is not correct"));

        String name = "Shkëlqim Hëna Çela";
        String pattern = ".*hena.*";
        boolean matches = name.toLowerCase().replace('ç', 'c')
                        .replace('ë', 'e').matches(pattern);
        System.out.println(name + " matches " + pattern + " ? " + matches);

    }

    private static void midtermRegex() {
        String phoneNr = "+355 68 22 22 222";
        String phoneFormat = "^\\+\\d{3} \\d{2} \\d{2} \\d{2} \\d{3}";
        System.out.println("Phone number " + phoneNr + (phoneNr.matches(phoneFormat) ? " is correct" : " is not correct"));
        String date = "2-11-2020";
        String dateFormat = "^(\\d|\\d{2})-\\d{2}-\\d{4}";
        System.out.println("Date " + date + (date.matches(dateFormat) ? " is correct": " is not correct"));
    }
}
