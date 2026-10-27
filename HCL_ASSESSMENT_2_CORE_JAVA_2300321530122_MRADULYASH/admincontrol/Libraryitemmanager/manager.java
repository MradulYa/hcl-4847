package HCL_ASSESSMENT_2_CORE_JAVA_2300321530122_MRADULYASH.admincontrol.Libraryitemmanager;

import HCL_ASSESSMENT_2_CORE_JAVA_2300321530122_MRADULYASH.admincontrol.Libraryitems.books;
import HCL_ASSESSMENT_2_CORE_JAVA_2300321530122_MRADULYASH.admincontrol.Libraryitems.dvd;
import HCL_ASSESSMENT_2_CORE_JAVA_2300321530122_MRADULYASH.admincontrol.Libraryitems.magazine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class manager {
    HashMap<Integer, books> bookslist=new HashMap<>();
    List<books> booksList=new ArrayList<>();
    List<dvd> dvdList=new ArrayList<>();
    List<magazine> magazineList=new ArrayList<>();
    @Override
    public void addbook(String bookname, int bookid, int countofbooks){
        books nook=new books();
        @Override
                public void setbookname(String bookname){
            super.setbookname(String bookname){
                super.setbookname;
            }
        }
        @Override
        public void setbookid(int bookid){
            super.setbookid(bookid);
        }
        @Override
        public void setcountofbooks(int countofbooks){
            super.setcountofbooks(countofbooks);
        }
    }
    @Override
    public void addmagazine(int bookid, String magazinename, int magazinecount){

    }
    @Override
    public void register(int bookid, String Studentname){
        if(bookslist.containsKey(bookid))
    }
    @Override
    public void deletebook(int bookid){
        if(booksList.containsKey(bookid)){
        books b=booksList.get(bookid);
        b.setCountofbooks(b.getCountofbooks()-1);

    }}

    @Override
    public void assignbook(int bookid, int Studentid){

    }
}
