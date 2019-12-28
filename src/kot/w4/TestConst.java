package kot.w4;

import java.util.List;

public class TestConst {
    public static void main(String[] args) {
        System.out.println(W4_1Kt.getNameTop());
        System.out.println(Student.INSTANCE.getName());
        System.out.println(Student.nameField);
        System.out.println(Student.getNameStatic());
        System.out.println(Student.nameConst);
    }
}
/*
   @JvmField
   @NotNull
   public static String nameTopFiled = "Mahmoud";

    @NotNull
    private static String nameTop = "Mahmoud";
*/
