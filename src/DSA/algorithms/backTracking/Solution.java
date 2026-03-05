package DSA.algorithms.backTracking;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private void solve(int[] nums, List<Integer> output,int index,List<List<Integer>> ans){
        // base case
        if(index>=nums.length){
            ans.add(new ArrayList<>(output));//adda copy of the subset
            return;
        }
        //exclusive case
        solve(nums,output,index+1,ans);
        //include case
        output.add(nums[index]);
        solve(nums,output,index+1,ans);
        //bacltrack and remove the last answer from the output to go to next
        output.remove(output.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums){
List<List<Integer>> ans=new ArrayList<>();
List<Integer> output =new ArrayList<>();
int index=0;
solve(nums,output,index,ans);
return ans;
    }
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] nums={1,2,3};
        List<List<Integer>> result=solution.subsets(nums);
        for (List<Integer> list : result){
            System.out.println(list);
        }
    }
}
