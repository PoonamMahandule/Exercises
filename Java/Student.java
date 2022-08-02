public class Student {
        String name,address;
        int marks, id;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }

        public int getMarks() {
            return marks;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public static void main(String[] args){
            Student s = new Student();
            s.setId(1001);
            s.setName("Poonam");
            s.setAddress("wz-109, Tilak Nagar,Delhi");
            s.setMarks(840);
            System.out.println("Id = "+s.getId());
            System.out.println("Name = "+s.getName());
            System.out.println("Address = "+s.getAddress());
            System.out.println("Marks = "+s.getMarks());
        }


}
