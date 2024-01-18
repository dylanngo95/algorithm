package collection;

import java.util.*;

class Role {
    public String name;
    public Set<String> permissions = new HashSet<>();

    @Override
    public int hashCode() {
        return Objects.hash(name, permissions);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return Objects.equals(name, ((Role) obj).name)
                && Objects.equals(permissions, ((Role) obj).permissions);
    }
}

class User {
    public String name;
    public Set<Role> roles = new HashSet<>();

    @Override
    public int hashCode() {
        return Objects.hash(name, roles);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return Objects.equals(name, ((User) obj).name)
                && Objects.equals(roles, ((User) obj).roles);
    }
}

public class UserMap {

    public void run() {
        Map<User, String> map = new HashMap<>();

        Role role = new Role();
        role.name = "Admin";
        role.permissions.add("Dash Board");

        User userMap = new User();
        userMap.name = "Dylan";
        userMap.roles.add(role);

        map.put(userMap, "test01");
        System.out.println(map.get(userMap));

        role.permissions.add("Customer");
        System.out.println(map.get(userMap));
    }

}