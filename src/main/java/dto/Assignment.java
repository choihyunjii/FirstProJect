package dto;

public class Assignment {
    private Integer id;



    private String name;
    private String year;
    private String ss;
    private String phone_number;
    private String etc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Assignment(Integer id, String name, String year, String ss, String phone_number, String etc) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.ss = ss;
        this.phone_number = phone_number;
        this.etc = etc;
    }
    public Assignment(String name, String year, String ss, String phone_number, String etc) {
        this.name = name;
        this.year = year;
        this.ss = ss;
        this.phone_number = phone_number;
        this.etc = etc;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

    public Assignment(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", ss='" + ss + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", etc='" + etc + '\'' +
                '}';
    }

}
