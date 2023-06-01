package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        // Normal function
        System.out.println(getDbUrl());

        // Supplier func - take no args and return one arg. Basically to supply a data.
        System.out.println(getDbUrlSupplier.get());
    }

    static String getDbUrl() {
        return "jdbc://localhost:3456/users";
    }

    static Supplier<String> getDbUrlSupplier = () -> "jdbc://localhost:3456/users";
}
