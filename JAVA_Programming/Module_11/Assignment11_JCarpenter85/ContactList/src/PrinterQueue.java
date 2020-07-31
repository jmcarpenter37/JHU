import java.util.LinkedList;

/**
 * @author John Carpenter
 */
public class PrinterQueue
{
    //initialize fields
    private LinkedList<String> print_queue = new LinkedList<>();
    private String job_id;
    private int print_time;


    //constructor
    PrinterQueue(String job_id , int print_time)
    {
        this.job_id = job_id;
        this.print_time = print_time;
    }
    // constructor
    PrinterQueue()
    {

    }
    // methods
    /**
     * AddTo adds to the nes printer queue data object
     */
    public void setJID_PTime(String job_id , int print_time)
    {
        this.job_id = job_id;
        this.print_time = print_time;
    }

    /**
     * The getJobName() method gets the current job name
     */
    public void getJobId()
    {
        System.out.println(this.job_id);
    }
    /**
     * The getPrintTime() method gets the current print time for a job
     */
    public void getPrintTime()
    {
        System.out.println(this.print_time);
    }

    /**
     * The addToPrinterQueue method adds the print time and job name to the linked list
     */
    public void addToPrinterQueue()
    {
        //add stuff to the LinkedList
        print_queue.add(this.job_id + " - " + this.print_time);
    }

    /**
     * Show printer queue
     */
    public void showPrinterQueue()
    {
        for(String str : print_queue)
        {
            System.out.println(str + "\n");
        }
    }
}
