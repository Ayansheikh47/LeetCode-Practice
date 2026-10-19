class ProductExceptSelf{
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int prod[] = new int[n];

        int leftProd = 1;
        for(int i=0; i<n; i++){
            prod[i]=leftProd;
            leftProd *= nums[i];
        }

        int rightProd = 1;
        for(int i=nums.length-1; i>=0; i--){
            prod[i] *= rightProd;
            rightProd *= nums[i];
        }

        return prod;
    }
}