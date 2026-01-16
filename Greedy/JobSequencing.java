
import java.util.*;
public class JobSequencing {

    static class Job{ //bundled all job information into one object.
        int id;
        int deadline;
        int profit;

        public Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;

        }

    }
    public static void main(String[] args) {
        int jobsInfo[][]={{1,40},{1,30},{4,20},{1,10}};

        // Arrays.sort(jobs,Comparator.comparingDouble(o ->o[1]));

        // ArrayList<Integer> ans= new ArrayList<>();
        // int time=0;
        // for(int i=jobs.length -1 ;i>=0;i--){
        //     if(jobs[i][0] >time ){
        //         time++;
        //         ans.add(jobs[i][1]);
        //     }
        // }
        // System.out.println(" no of jobs done : "+ time);
        // System.out.println("profit of jobs selected :" + ans);

        ArrayList<Job> jobs=new ArrayList<>();
        for(int i=0;i<jobsInfo.length;i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        //descending order of profit
        Collections.sort(jobs,(a,b)-> b.profit-a.profit);

        ArrayList<Integer> ans= new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline >time){
                ans.add(curr.id);
                time++;
            }
        }
        //print ans
        System.out.println("Maximum jobs :"+ ans.size());
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }

    }
}
