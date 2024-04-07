class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) { // 입력값 배열을 처음부터 순회
            for(int j=i+1; j<nums.length; j++) { // 입력값 배열을 그다음부터 순회
                if(nums[i] + nums[j] == target) { // 두 값의 합을 비교해 target과 일치하는 경우 정답으로 리턴
                    return new int[]{i, j};
                };
            };
        };
        return null; // 항상 정답이 존재하므로 널이 리턴되는 경우는 없음
    };
};