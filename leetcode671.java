/* https://github.com/103style/LeetCode/blob/master/Depth-first%20Search/671.%20Second%20Minimum%20Node%20In%20a%20Binary%20Tree.md */
public int findSecondMinimumValue(TreeNode root) {
    Set<Integer> set = new HashSet<>();
    dfs(root, set);

    List<Integer> list = new ArrayList<>(set);
    if(list.size() == 1) return -1;

    Collections.sort(list);
    return list.get(1);
}

void dfs(TreeNode node, Set<Integer> set){
    if(node == null) return;

    set.add(node.val);

    dfs(node.left, set);
    dfs(node.right, set);
}
