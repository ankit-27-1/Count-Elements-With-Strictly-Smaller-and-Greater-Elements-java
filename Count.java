class Count {
    public int countElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int count=0;
        int a=nums[0];
        int b=nums[n-1];
        for(int i=0;i<n;i++){
            if(nums[i]==a){
                count++;
            }
            else if(nums[i]==b){
                count++;
            }
        }
        return n-count;
    }
}
