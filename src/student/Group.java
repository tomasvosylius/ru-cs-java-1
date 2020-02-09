package student;

/**
 *
 * @author tomasvosylius
 */
public class Group
{   
    private int last_idx = 0;
    private Student[] array;
    /**
     *
     * @param size size of group to create
     */
    public Group(int size)
    {
        this.last_idx = 0;
        this.array = new Student[size];
    }
    
    /**
     *
     * @return returns array of Student instances inside group
     */
    public Student[] getStudents()
    {
        return this.array;
    }
    
    /**
     *
     * @param student instance of class Student to insert
     */
    public void addStudent(Student student)
    {
        System.out.println("[debug] adding student to group to group: " + student.getNumber() + ", " + student.getName() + " " + student.getSurname());
        if(last_idx >= this.array.length - 1)
        {
            // this would cause out-of-bound error. return
            return;
        }
        
        this.array[this.last_idx] = student;
        this.last_idx += 1; // increase last index by 1
    }
  
    public void editStudent(int number, String name, String surname)
    {
        int s_i = findStudentByNumber(number);
        if(s_i != -1)
        {
            this.array[s_i].setName(name);
            this.array[s_i].setName(surname);
        }
    }
    
    private int findStudentByNumber(int number)
    {
        for(int s = 0; s < this.last_idx; s++)
        {
            if(this.array[s].getNumber() == number) return s;
        }
        return -1;
    }
    
    /**
     * prints students in a group
     * @return 
     */
    @Override
    public String toString()
    {
        // for(Student s : this.array)
        for(int s = 0; s < this.array.length; s++)
        {
            // System.out.println(s.toString());
            System.out.println("Printing student: " + s + " " + this.array[s]);
        }
        return str.toString();
    }   

}
