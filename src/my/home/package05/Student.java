package my.home.package05;

public class Student {
    private int studentId;
    private static String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void testA() {
        Address address = new Address();
        System.out.println(address.email);
    }

    public static class Address {
        private String city;
        private String email;

        public Address() {
        }

        public Address(String city, String email) {
            this.city = city;
            this.email = email;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void test() {

        }
    }
}
