public class StringBuilder_StringBuffer{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // 1. append()
        sb.append("Name:Alice").append(" Age:20").append(" Grade:B");
        System.out.println("1. append(): " + sb);

        // 2. insert()
        sb.insert(0, "ID:101 ");
        System.out.println("2. insert(): " + sb);

        // 3. delete()
        int ageStart = sb.indexOf("Age:");
        int ageEnd = sb.indexOf(" ", ageStart + 1);
        if (ageEnd == -1) ageEnd = sb.length();
        sb.delete(ageStart, ageEnd + 1); // +1 to include the trailing space
        System.out.println("3. delete(): " + sb);

        // 4. replace()
        int gradeIndex = sb.indexOf("Grade:");
        System.out.println("    gradeIndex = " + gradeIndex + ", length = " + sb.length());
        sb.replace(gradeIndex + 6, gradeIndex + 7, "A+");
        System.out.println("4. replace(): " + sb + " (length=" + sb.length() + ")");

        // 5. deleteCharAt()
        int plusIndex = sb.indexOf("+");
        System.out.println("    plusIndex = " + plusIndex + ", length = " + sb.length());
        if (plusIndex != -1 && plusIndex < sb.length()) {
            sb.deleteCharAt(plusIndex);
        }
        System.out.println("5. deleteCharAt(): " + sb);

        // 6. setCharAt()
        sb.setCharAt(3, '2');
        System.out.println("6. setCharAt(): " + sb);

        // 7. indexOf()
        int namePos = sb.indexOf("Name");
        System.out.println("7. indexOf('Name'): " + namePos);

        // 8. lastIndexOf()
        int lastColon = sb.lastIndexOf(":");
        System.out.println("8. lastIndexOf(':'): " + lastColon);

        // 9. indexOf(str, from)
        int nextColon = sb.indexOf(":", 5);
        System.out.println("9. indexOf(':', 5): " + nextColon);

        // 10. substring(s,e)
        int nameStart = sb.indexOf("Name:") + 5;
        int nameEnd = sb.indexOf(" ", nameStart);
        String name = sb.substring(nameStart, nameEnd);
        System.out.println("10. substring(): " + name);

        // 11. charAt()
        int gradePos = sb.indexOf("Grade:") + 6;
        char grade = sb.charAt(gradePos);
        System.out.println("11. charAt(): " + grade);

        // 12. length()
        int len = sb.length();
        System.out.println("12. length(): " + len);

        // 13. capacity()
        int cap = sb.capacity();
        System.out.println("13. capacity(): " + cap);

        // 14. reverse() 
        sb.reverse();
        System.out.println("14. reverse(): " + sb);
        sb.reverse(); // flip back
        System.out.println("    reverse() back: " + sb);

        // 15. toString() — convert back to String
        String profile = sb.toString();
        System.out.println("15. toString(): " + profile);
    }
}
