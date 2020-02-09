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
        if(last_idx >= this.array.length)
        {
            // this would cause out-of-bound error. return
            return;
        }
        
        this.array[this.last_idx] = student;
        this.last_idx += 1; // increase last index by 1
    }
  
    /**
     * 
     * @param number student-number to look for when editing
     * @param name new name
     * @param surname new surname
     */
    public void editStudent(int number, String name, String surname)
    {
        int s_i = this.findStudentByNumber(number);
        if(s_i != -1)
        {
            this.array[s_i].setName(name);
            this.array[s_i].setSurname(surname);
        }
    }
    /**
     * 
     * @param number student number to look for
     * @return index in array
     */
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
        StringBuilder str = new StringBuilder();
        for(Student s : this.array)
        {
            str.append(s).append("\n");
        }
        return str.toString();
    }   
}
