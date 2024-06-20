class Solution {

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (String cpDomain : cpdomains) {
            calcVisit(cpDomain, map);
        }

        StringBuilder sb = new StringBuilder();
        map.forEach((domain, val) -> {
            result.add(sb.append(val).append(" ").append(domain).toString());
            sb.delete(0, sb.length());
        });

        return result;
    }

    private void calcVisit(String cpDomain, Map<String, Integer> map) {
        int spaceIndex = 0;
        while (cpDomain.charAt(spaceIndex) != ' ') {
            spaceIndex += 1;
        }

        int count = Integer.parseInt(cpDomain.substring(0, spaceIndex));

        for (int i = cpDomain.length() - 1; i >= spaceIndex; i--) {
            if (cpDomain.charAt(i) == '.' || cpDomain.charAt(i) == ' ') {
                String domain = cpDomain.substring(i + 1, cpDomain.length());
                if (map.containsKey(domain)) {
                    int oldVal = map.get(domain);
                    map.replace(domain, oldVal + count);
                } else {
                    map.put(domain, count);
                }
            }
        }

    }
}