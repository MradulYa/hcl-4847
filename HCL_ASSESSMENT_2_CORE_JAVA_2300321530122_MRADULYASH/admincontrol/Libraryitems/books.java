package HCL_ASSESSMENT_2_CORE_JAVA_2300321530122_MRADULYASH.admincontrol.Libraryitems;

public abstract class books {
    public String bookname;
    public int bookid;
    public int countofbooks;

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public int getCountofbooks() {
        return countofbooks;
    }

    public void setCountofbooks(int countofbooks) {
        this.countofbooks = countofbooks;
    }
}
