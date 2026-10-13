package Libraryitemmanager;

import java.util.Scanner;

public class lib extends libitems{
    static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Library Mgmt System");
        libitems admin=new lib();
        admin.addbook(1,Maths,16);
        System.out.println(admin.booksList);
        System.out.println(admin.booksList);
        System.out.println("1 for adding books");
        System.out.println("2 for deleting books");
        System.out.println("3 for assigning books");
        System.out.println("4 for assigning magazines");
        boolean flag=true;
        while(flag){
            System.out.println("Enter options");
            int option=sc.nextInt();
            switch(option){
                case 1;
                manager admin=new lib();
                    System.out.println("enter book id:");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter book name");
                    String bookname =sc.nextLine();
                    System.out.println("enter book count:");
                    int bookcount=sc.nextInt();
                    admin.addbook(id,bookname, countofbook);
                    break;
                case 2 : {
                    LibraryManager admin = new Library();
                    System.out.print("Enter book id which you want to remove : ");
                    int id = sc.nextInt();
                    admin.deleteBook(id);
                    break;
                }
                case 3 :{
                    LibraryManager admin = new Library();
                    admin.showBooks();
                }
                default:
                    System.out.println("Exiting the System");
                    flag = false;

            }
        }
            }
        }
    }
}
