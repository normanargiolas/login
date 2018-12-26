package it.namron.login;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Credential {
    /**
     * A dummy authentication store containing known user names and passwords.
     * TODO: remove after connecting to a real authentication system.
     */

    public static class Data {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Data(String name, String email, String password, String icon) {
            this.name = name;
            this.email = email;
            this.password = password;
            this.icon = icon;
        }

        String name;
        String email;
        String password;
        String icon;
    }


    public static final Map<String, Data> credential;

    static {
        Map<String, Data> DUMMY = new HashMap<String, Data>();
        DUMMY.put("davide.spano", new Data("Davide", "davide@mail.it", "123456", "davide"));
        DUMMY.put("vittoria.frau", new Data("Vittoria", "vittoria@mail.it", "123456", "vittoria"));
        DUMMY.put("alessandro.carcangiu", new Data("Alessandro", "alessandro@mail.it", "123456", "alessandro"));
        credential = Collections.unmodifiableMap(DUMMY);
    }
}
