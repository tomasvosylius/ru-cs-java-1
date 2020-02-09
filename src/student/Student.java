package student;

/**
 * Creates an instance of Group
 * @author tomasvosylius
 */
public class Student
{
    private int number;
    private String name;
    private String surname;
    
    /**
     *
     * @param name students name
     * @param surname students surname
     * @param number student number
     */
    public Student(String name, String surname, int number)
    {
        this.name       = name;
        this.surname    = surname;
        this.number     = number;
    }
    
    public int getNumber()
    {
        return number;
    }
    
    /**
     *
     * @param number
     */
    public void setNumber(int number)
    {
        this.number = number;
    }
    
    
    public String getName()
    {
        return name;
    }
    /**
     *
     * @param name new name to set for a student
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    
     public String getSurname()
    {
        return surname;
    }
    /**
     *
     * @param surname new surname to set for a student
     */
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    
    
    
    @Override
    public String toString()
    {
        return (this.name + " " + this.surname + " s" + this.number);
    }
}