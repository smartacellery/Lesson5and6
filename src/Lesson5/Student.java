package Lesson5;

public class Student {

    //define properties
    //instance variables = properties
    //usally declared as private
    //new is the word that makes the object
    private String name;
    private int test1, test2, test3;


    //constructor
    //public <Name of the Class>
    //this runs when object is made (instantied)
    //with the key word "NEW"
    //its job is to initialize some or all of the 
    //properties / instance variables of the object 
    public Student() {
        //    name = "";
        //    test1 = 0;
        //    test2 = 0;
        //    test3 = 0;
        //    System.out.println("Student has been created");

        //Call another constructor to clone properties from another student
        this("", 0, 0, 0);
        //This is called CHAINING consructors
        //this= look elsewhere to set all properties as you make it

    }

    //2nd constructor to set all properties as you make it
    public Student(String n, int t1, int t2, int t3) {
        name = n;
        test1 = t1;
        test2 = t2;
        test3 = t3;

    }

    //3d constructor to clone propetries from another student
    public Student(Student other) {
        //   name=other.name;
        //    test1= other.test1;
        //    test2=other.test2;
        //    test3=other.test3;
        this(other.name, other.test1, other.test2, other.test3);
    }

    //add INSTANCE methods to make up the abilities of the student
    //access to name to set it and get it
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
    public String validateData() {
        String em = null;
        if (name.equals(""))//then a name was not entered
        {em="Name is required.";}
        if (test1 < 0 || test1 > 100 || test2 < 0 || test2 > 100 || test3 < 0 || test3 > 100) {
                if (em == null) // then name was  entered
                {
                    em = "At least 1 mark is out of the acceptable range";
                } else //add on to message with +=
                {
                    em += "\nAt least 1 mark is out of the acceptable range";
                }
            }
        
        if (em != null) //then we have an error so add the following line after it
        {
            em += "\nPlease re enter all the data\n";
        }
        return em;//return the error message, either as null or a real message
    }

    //access to test scores
    public void setScore(int whichtest, int score) {
        if (whichtest == 1) {
            test1 = score;
        } else if (whichtest == 2) {
            test2 = score;
        } else {
            test3 = score;
        }

    }

    public int getScore(int which) {
        if (which == 1) {
            return test1;
        } else if (which == 2) {
            return test2;
        } else {
            return test3;
        }
    }

    //average nd highscore methods
    public int getHighScore() {
        if (test1 > test2 && test1 > test3) {
            return test1;
        } else if (test2 > test1 && test2 > test3) {
            return test2;
        } else {
            return test3;
        }

    }

    public int getAverage() {
        return (test1 + test2 + test3) / 3;
    }

    //toString runs automatically when you print an object
    //all objects get a toString from parent Object class
    //but you can make your own better version
    public String toString() {
        String s = "Name > \t" + name;
        s += "\nTest 1 > \t" + test1;
        s += "\nTest 2 > \t" + test2;
        s += "\nTest 3 > \t" + test3;
        s += "\n----------------";
        s += "\nAverage> \t" + getAverage() + "\n\n";
        return s;
    }
}
