class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        List<Integer> list=new ArrayList<>(hmap.keySet());
        list.sort((a,b)->hmap.get(b)-hmap.get(a));
        int []ans=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=list.get(i);
        }
        return ans;
    }
}
