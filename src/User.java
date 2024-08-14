public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }
    public void setName(String name) throws IllegalNameException {
        if (name.length() > 20){
            throw  new IllegalNameException("Ошибка. Длига имени " +
                    "не может быть больше 20 символов. " +
                    "Вы ввели " + name);
        }
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) throws IllegalAgeException {
        if (age <= 0 || age > 150){
            throw new IllegalAgeException("Ошибка. Возраст " +
                    "юзере не может быть больше 150 или меньше " +
                    "нуля. Вы ввели " + age);
        }
        this.age = age;
    }
}
