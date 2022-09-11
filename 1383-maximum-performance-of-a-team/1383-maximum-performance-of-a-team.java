class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		mergeSort(efficiency, speed, 0, n);
		long sum = 0;
		long max = 0;
		for (int i = 0; i < speed.length; i++) {
			if (q.size() < k) {
				q.add(speed[i]);
				sum += speed[i];
				long t = sum * efficiency[i];
				max = Long.max(max, t);
			} else if (q.peek() < speed[i]) {
				sum -= q.remove();
				q.add(speed[i]);
				sum += speed[i];
				long t = sum * efficiency[i];
				max = Long.max(max, t);
			}
		}
		max = max % 1000000007;
		return (int) max;
    }
	public static void mergeSort(int[] nums, int[] indices, int start, int end) {
		if (start + 1 >= end) {
			return;
		}
		int mid = (start + end) / 2;
		mergeSort(nums, indices, start, mid);
		mergeSort(nums, indices, mid, end);
		merge(nums, indices, start, mid, end);
	}

	public static void merge(int[] nums, int[] indices, int start, int mid, int end) {
		int i = start;
		int j = mid;
		int[] temp = new int[end - start];
		int[] tempo = new int[end - start];
		int k = 0;
		while (i < mid && j < end) {
			if (nums[i] > nums[j]) {
				tempo[k] = indices[i];
				temp[k++] = nums[i++];
			} else {
				tempo[k] = indices[j];
				temp[k++] = nums[j++];
			}
		}
		while (i < mid) {
			tempo[k] = indices[i];
			temp[k++] = nums[i++];
		}
		while (j < end) {
			tempo[k] = indices[j];
			temp[k++] = nums[j++];
		}
		k = 0;
		for (i = start; i < end; i++) {
			indices[i] = tempo[k];
			nums[i] = temp[k++];
		}
	}
}