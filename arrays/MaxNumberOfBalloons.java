class MaximumNumberOfBaloons {
    public int maxNumberOfBalloons(String text) {
        int n = text.length();

        int[] uniques = new int[26];
        for (char c : text.toCharArray()) {
            uniques[c - 'a']++;
        }

        int min = n;
        uniques[11] = uniques[11] / 2;
        uniques[14] = uniques[14] / 2;
        for (int idx: new int[]{1, 0, 11, 14, 13}) {
            min = Math.min(min, uniques[idx]);
        }

        return min==n ? 0: min;
    }
}
