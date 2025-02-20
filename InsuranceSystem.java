import java.time.LocalDate;
import java.util.*;

class Policy {
    String policyNumber;
    String policyHolder;
    LocalDate expiryDate;

    public Policy(String policyNumber, String policyHolder, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "PolicyNumber: " + policyNumber + ", Holder: " + policyHolder + ", Expiry: " + expiryDate;
    }
}

class InsurancePolicyManagement {
    private Map<String, Policy> policyMap = new HashMap<>();
    private Map<String, Policy> orderedPolicyMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<Policy>> expiryPolicyMap = new TreeMap<>();

    public void addPolicy(String policyNumber, String policyHolder, LocalDate expiryDate) {
        Policy policy = new Policy(policyNumber, policyHolder, expiryDate);
        policyMap.put(policyNumber, policy);
        orderedPolicyMap.put(policyNumber, policy);
        expiryPolicyMap.computeIfAbsent(expiryDate, k -> new ArrayList<>()).add(policy);
    }

    public Policy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    public List<Policy> getExpiringPolicies(int days) {
        LocalDate threshold = LocalDate.now().plusDays(days);
        List<Policy> expiringPolicies = new ArrayList<>();
        for (Map.Entry<LocalDate, List<Policy>> entry : expiryPolicyMap.headMap(threshold, true).entrySet()) {
            expiringPolicies.addAll(entry.getValue());
        }
        return expiringPolicies;
    }

    public List<Policy> getPoliciesByHolder(String policyHolder) {
        List<Policy> holderPolicies = new ArrayList<>();
        for (Policy policy : policyMap.values()) {
            if (policy.policyHolder.equals(policyHolder)) {
                holderPolicies.add(policy);
            }
        }
        return holderPolicies;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        expiryPolicyMap.headMap(today, true).clear();
        policyMap.values().removeIf(p -> p.expiryDate.isBefore(today));
        orderedPolicyMap.values().removeIf(p -> p.expiryDate.isBefore(today));
    }

    public void displayPolicies() {
        for (Policy policy : orderedPolicyMap.values()) {
            System.out.println(policy);
        }
    }
}

public class InsuranceSystem {
    public static void main(String[] args) {
        InsurancePolicyManagement system = new InsurancePolicyManagement();

        system.addPolicy("P101", "Alice", LocalDate.now().plusDays(20));
        system.addPolicy("P102", "Bob", LocalDate.now().plusDays(10));
        system.addPolicy("P103", "Alice", LocalDate.now().plusDays(40));
        system.addPolicy("P104", "Charlie", LocalDate.now().minusDays(5));

        System.out.println("All Policies:");
        system.displayPolicies();

        System.out.println("\nExpiring in 30 days:");
        System.out.println(system.getExpiringPolicies(30));

        System.out.println("\nPolicies for Alice:");
        System.out.println(system.getPoliciesByHolder("Alice"));

        system.removeExpiredPolicies();
        System.out.println("\nAfter removing expired policies:");
        system.displayPolicies();
    }
}
