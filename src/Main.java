public class Main {
    public static void main(String[] args) {
        //Задание 1
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich";
        String fullName = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника — " + fullName + ".");

        //Задание 2   Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
        String caps = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + caps);

        //Задание 3 ё в е Иванов Семён Семёнович
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);

        //Задание 4
        fullName = "Ivanov Ivan Ivanovich";
        int cut = fullName.indexOf(" ");
        int secondCut = fullName.lastIndexOf(" ");
        firstName = fullName.substring(0, cut);
        middleName = fullName.substring(cut, secondCut);
        lastName = fullName.substring(secondCut);
        System.out.println("Фамилия сотрудника — " + firstName);
        System.out.println("Имя сотрудника —" + middleName);
        System.out.println("Отчество сотрудника —" + lastName);

        //Задание 5 toCharArray() зачем он?
        fullName = "ivanov ivan ivanovich";
        String bigLetter1 = fullName.substring(0, 1).toUpperCase();
        String bigLetter2 = fullName.substring(cut, cut + 2).toUpperCase();
        String bigLetter3 = fullName.substring(secondCut, secondCut + 2).toUpperCase();
        String nameCapital = bigLetter1 + fullName.substring(1, cut) + bigLetter2 + fullName.substring(cut + 2, secondCut) + bigLetter3 + fullName.substring(secondCut + 2);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + nameCapital);

        //Задание 6 по-моему здесь что-то совсем не то
        String numbers1 = "135";
        String numbers2 = "246";
        String numbersTogether;
        StringBuilder sb = new StringBuilder(numbers1);
        char char1 = numbers2.charAt(0);
        char char2 = numbers2.charAt(1);
        char char3 = numbers2.charAt(2);
        sb.insert(1, char1);
        sb.insert(3, char2);
        sb.insert(5, char3);
        System.out.println("Данные строки — " + sb);

        //Задание 6 второй вариант

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < numbers1.length(); i++) {
            stringBuilder.append(numbers1.charAt(i)).append(numbers2.charAt(i));
        }
        System.out.println("Данные строки — " + stringBuilder);

        //Задание 7

        String doubleTrouble = "aabccddefgghiijjkk";
        char[] arr = doubleTrouble.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.print(arr[i]);
            }
        }


    }
}