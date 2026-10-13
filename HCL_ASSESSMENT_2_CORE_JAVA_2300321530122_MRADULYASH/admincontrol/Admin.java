package HCL_ASSESSMENT_2_CORE_JAVA_2300321530122_MRADULYASH.admincontrol;

public interface Admin {
    void addbook(int bookid, String bookname, int bookcount);
    void addmagazine(int bookid, String bookname, int bookcount);
    void register(int bookid, String Studentname);
    void dltbook(int bookid);
    void assignbook(int id, int Studentid);

}
