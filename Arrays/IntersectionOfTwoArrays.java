class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> isc = new HashSet<>();

        for(int n: nums1){
            isc.add(n);
        }

        int[] interS = new int[Math.min(nums1.length,nums2.length)];
        int idx = 0;

        for(int n: nums2){
            if(isc.contains(n)){
                interS[idx]=n;
                isc.remove(n);
                idx++;
            }
        }
        return Arrays.copyOf(interS,idx);
    }
}