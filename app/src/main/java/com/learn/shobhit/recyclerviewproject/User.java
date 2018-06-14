package com.learn.shobhit.recyclerviewproject;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    String email;
    String photoUrl;
    String phone;

    public User(String name, String email, String phone, String photoUrl) {
        this.name = name;
        this.email = email;
        this.photoUrl = photoUrl;
        this.phone = phone;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public static List<User> getDummyUserList(){
        List<User> resultList = new ArrayList<>();
        resultList.add(new User("Brock Lee", "Brock@gmaill.com", "(444) 133-2265", "http://www.designskilz.com/random-users/images/imageF16.jpg"));
        resultList.add(new User("Barb Ackue", "Barb@gmaill.com", "(377) 682-6969", "http://www.designskilz.com/random-users/images/imageF11.jpg"));
        resultList.add(new User("Phil Harmonic ", "Phil@gmaill.com", "(653) 886-3808", "http://www.designskilz.com/random-users/images/imageM23.jpg"));
        resultList.add(new User("Buck Kinnear", "Buck@gmaill.com", "(795) 327-9011", "http://www.designskilz.com/random-users/images/imageF12.jpg"));
        resultList.add(new User("Sal Monella", "Sal@gmaill.com", "(537) 644-9176", "http://www.designskilz.com/random-users/images/imageF21.jpg"));
        resultList.add(new User("Nick R. Bocker", "Nick@gmaill.com", "(686) 983-0443", "http://www.designskilz.com/random-users/images/imageF10.jpg"));
        resultList.add(new User("Jimmy Changa", "Jimmy@gmaill.com", "(516) 288-1765", "http://www.designskilz.com/random-users/images/imageF28.jpg"));
        resultList.add(new User("Saul T. Balls", "Saul@gmaill.com", "(764) 457-4176", "http://www.designskilz.com/random-users/images/imageM5.jpg"));
        resultList.add(new User("Bill Emia", "Bill@gmaill.com", "(820) 542-1009", "http://www.designskilz.com/random-users/images/imageM30.jpg"));
        resultList.add(new User("Holly Graham", "Holly@gmaill.com", "(189) 990-6654", "http://www.designskilz.com/random-users/images/imageM15.jpg"));
        resultList.add(new User("Stew Gots", "Stew@gmaill.com", "(837) 411-1257", "http://www.designskilz.com/random-users/images/imageM28.jpg"));
        resultList.add(new User("Arty Ficial", "Arty@gmaill.com", "(662) 723-1085", "http://www.designskilz.com/random-users/images/imageM24.jpg"));
        resultList.add(new User("Poppa Cherry", "Poppa@gmaill.com", "(305) 855-6429", "http://www.designskilz.com/random-users/images/imageM2.jpg"));
        resultList.add(new User("Marvin Gardens", "Marvin@gmaill.com", "(428) 403-2343", "http://www.designskilz.com/random-users/images/imageM22.jpg"));
        resultList.add(new User("Pete Sariya", "Pete@gmaill.com", "(807) 122-4930", "http://www.designskilz.com/random-users/images/imageF19.jpg"));
        resultList.add(new User("Paige Turner", "Paige@gmaill.com", "(956) 360-9763", "http://www.designskilz.com/random-users/images/imageF7.jpg"));
        resultList.add(new User("Donatella Nobatti", "Donatella@gmaill.com", "(457) 111-7908", "http://www.designskilz.com/random-users/images/imageM26.jpg"));
        resultList.add(new User("Otto Matic", "Otto@gmaill.com", "(288) 132-1669", "http://www.designskilz.com/random-users/images/imageM8.jpg"));
        resultList.add(new User("Pat Agonia", "Pat@gmaill.com", "(222) 368-0960", "http://www.designskilz.com/random-users/images/imageM18.jpg"));
        resultList.add(new User("Paul Molive", "Paul@gmaill.com", "(554) 585-0197", "http://www.designskilz.com/random-users/images/imageF4.jpg"));
        resultList.add(new User("Rick O'Shea", "Rick@gmaill.com", "(511) 616-5672", "http://www.designskilz.com/random-users/images/imageF18.jpg"));
        resultList.add(new User("Monty Carlo", "Monty@gmaill.com", "(195) 771-9415", "http://www.designskilz.com/random-users/images/imageF20.jpg"));
        resultList.add(new User("Polly Tech", "Polly@gmaill.com", "(926) 561-8619", "http://www.designskilz.com/random-users/images/imageM14.jpg"));
        resultList.add(new User("Hal Appeno ", "Hal@gmaill.com", "(626) 417-7693", "http://www.designskilz.com/random-users/images/imageM7.jpg"));
        resultList.add(new User("Terry Aki", "Terry@gmaill.com", "(840) 843-5097", "http://www.designskilz.com/random-users/images/imageF25.jpg"));
        resultList.add(new User("Barb Dwyer", "Barb@gmaill.com", "(316) 436-7235", "http://www.designskilz.com/random-users/images/imageF24.jpg"));
        resultList.add(new User("Al Dente", "Al@gmaill.com", "(531) 313-6591", "http://www.designskilz.com/random-users/images/imageM12.jpg"));
        resultList.add(new User("Sue Vaneer", "Sue@gmaill.com", "(140) 446-4420", "http://www.designskilz.com/random-users/images/imageF22.jpg"));
        resultList.add(new User("Ira Membrit", "Ira@gmaill.com", "(738) 805-2100", "http://www.designskilz.com/random-users/images/imageF14.jpg"));
        resultList.add(new User("Barry Cade", "Barry@gmaill.com", "(620) 960-7080", "http://www.designskilz.com/random-users/images/imageM20.jpg"));
        resultList.add(new User("Barry Wine", "Barry@gmaill.com", "(978) 293-5402", "http://www.designskilz.com/random-users/images/imageF29.jpg"));
        resultList.add(new User("Robin Banks", "Robin@gmaill.com", "(158) 710-3452", "http://www.designskilz.com/random-users/images/imageF27.jpg"));
        resultList.add(new User("Tara Zona", "Tara@gmaill.com", "(968) 955-7117", "http://www.designskilz.com/random-users/images/imageM19.jpg"));
        resultList.add(new User("Bob Frapples", "Bob@gmaill.com", "(659) 279-3875", "http://www.designskilz.com/random-users/images/imageF8.jpg"));
        resultList.add(new User("Shonda Leer", "Shonda@gmaill.com", "(295) 876-6045", "http://www.designskilz.com/random-users/images/imageF15.jpg"));
        resultList.add(new User("Zack Lee", "Zack@gmaill.com", "(317) 897-7020", "http://www.designskilz.com/random-users/images/imageM3.jpg"));
        resultList.add(new User("Gail Forcewind", "Gail@gmaill.com", "(298) 736-3154", "http://www.designskilz.com/random-users/images/imageF6.jpg"));
        resultList.add(new User("Frank N. Stein", "Frank@gmaill.com", "(939) 414-7982", "http://www.designskilz.com/random-users/images/imageM16.jpg"));
        resultList.add(new User("Bud Wiser", "Bud@gmaill.com", "(882) 442-5862", "http://www.designskilz.com/random-users/images/imageM13.jpg"));
        resultList.add(new User("Anna Mull", "Anna@gmaill.com", "(651) 715-4980", "http://www.designskilz.com/random-users/images/imageF5.jpg"));
        resultList.add(new User("Petey Cruiser", "Petey@gmaill.com", "(699) 757-1089", "http://www.designskilz.com/random-users/images/imageF2.jpg"));
        resultList.add(new User("Mario Speedwagon", "Mario@gmaill.com", "(232) 437-6677", "http://www.designskilz.com/random-users/images/imageF1.jpg"));
        resultList.add(new User("Peter Pants", "Peter@gmaill.com", "(520) 932-8604", "http://www.designskilz.com/random-users/images/imageM6.jpg"));
        resultList.add(new User("Anna Rexia", "Anna@gmaill.com", "(853) 157-5306", "http://www.designskilz.com/random-users/images/imageM29.jpg"));
        resultList.add(new User("Maya Didas", "Maya@gmaill.com", "(708) 777-7110", "http://www.designskilz.com/random-users/images/imageF17.jpg"));
        resultList.add(new User("Cory Ander", "Cory@gmaill.com", "(383) 991-6107", "http://www.designskilz.com/random-users/images/imageF26.jpg"));
        resultList.add(new User("Tom Foolery", "Tom@gmaill.com", "(303) 867-1695", "http://www.designskilz.com/random-users/images/imageM11.jpg"));
        resultList.add(new User("Graham Cracker", "Graham@gmaill.com", "(169) 155-7250", "http://www.designskilz.com/random-users/images/imageM10.jpg"));
        resultList.add(new User("Cam L. Toe", "Cam@gmaill.com", "(514) 346-9980", "http://www.designskilz.com/random-users/images/imageM17.jpg"));
        resultList.add(new User("Wilma Mumduya", "Wilma@gmaill.com", "(978) 383-1708", "http://www.designskilz.com/random-users/images/imageF30.jpg"));
        resultList.add(new User("Cliff Hanger", "Cliff@gmaill.com", "(558) 292-0987", "http://www.designskilz.com/random-users/images/imageF23.jpg"));
        resultList.add(new User("Will Power", "Will@gmaill.com", "(101) 267-6248", "http://www.designskilz.com/random-users/images/imageM125.jpg"));
        resultList.add(new User("Phil Anthropist ", "Phil@gmaill.com", "(990) 415-6963", "http://www.designskilz.com/random-users/images/imageM21.jpg"));
        resultList.add(new User("Greta Life", "Greta@gmaill.com", "(507) 270-0849", "http://www.designskilz.com/random-users/images/imageF13.jpg"));
        resultList.add(new User("Buster Hyman", "Buster@gmaill.com", "(861) 822-7551", "http://www.designskilz.com/random-users/images/imageM1.jpg"));
        resultList.add(new User("Juan Annatoo", "Juan@gmaill.com", "(418) 705-8787", "http://www.designskilz.com/random-users/images/imageM27.jpg"));
        resultList.add(new User("Anna Sthesia", "Anna@gmaill.com", "(492) 689-2361", "http://www.designskilz.com/random-users/images/imageF3.jpg"));
        resultList.add(new User("Moe Fugga", "Moe@gmaill.com", "(174) 109-1915", "http://www.designskilz.com/random-users/images/imageM9.jpg"));
        resultList.add(new User("Don Stairs", "Don@gmaill.com", "(304) 776-7764", "http://www.designskilz.com/random-users/images/imageM4.jpg"));
        resultList.add(new User("Walter Melon", "Walter@gmaill.com", "(616) 480-9890", "http://www.designskilz.com/random-users/images/imageF9.jpg"));
        return resultList;
    }

}