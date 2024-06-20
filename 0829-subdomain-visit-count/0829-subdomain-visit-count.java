class Solution {
  
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> visitCounts = new HashMap<>();
      
        for (String domainInfo : cpdomains) {
            int spaceIndex = domainInfo.indexOf(" ");
            int visitCount = Integer.parseInt(domainInfo.substring(0, spaceIndex));
          
            for (int i = spaceIndex; i < domainInfo.length(); ++i) {
                if (domainInfo.charAt(i) == ' ' || domainInfo.charAt(i) == '.') {
                    String subdomain = domainInfo.substring(i + 1);
                    visitCounts.put(subdomain, visitCounts.getOrDefault(subdomain, 0) + visitCount);
                }
            }
        }
      
        List<String> results = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : visitCounts.entrySet()) {
            // Format the entry as "visit_count domain" and add it to the results list.
            results.add(entry.getValue() + " " + entry.getKey());
        }
      
        return results;
    }
}