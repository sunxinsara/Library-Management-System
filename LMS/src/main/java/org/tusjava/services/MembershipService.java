package org.tusjava.services;

import org.tusjava.enties.Member;

import java.util.HashMap;
import java.util.Map;

public class MembershipService {
    private Map<Integer, Member> members;  // An in-memory map to simulate a database.
    private int nextId;  // To simulate auto-incrementing primary keys in a database.

    public MembershipService() {
        this.members = new HashMap<>();
        this.nextId = 1;  // Initialize ID counter.
    }

    // Adds a new member to the library
    public boolean addMember(Member member) {
        if (member != null && !members.containsKey(member.getMemberId())) {
            int memberId = nextId++;
            member.setMemberId(memberId);
            members.put(memberId, member);
            return true;
        }
        return false;
    }

    // Updates member information
    public boolean updateMember(int memberId, String newName, String newAddress, String newEmail, String newPhone) {
        Member existingMember = members.get(memberId);
        if (existingMember != null) {
            existingMember.setName(newName);
            existingMember.setAddress(newAddress);
            existingMember.setEmail(newEmail);
            existingMember.setPhone(newPhone);
            return true;
        }
        return false;
    }

    // Renews a member's subscription
    public boolean renewMembership(int memberId) {
        Member member = members.get(memberId);
        if (member != null) {
            // Process the renewal. This might involve setting a new expiration date and handling payment.
            // Here we just assume renewal is always successful.
            return true;
        }
        return false;
    }

    // Retrieves a member by their ID
    public Member getMember(int memberId) {
        return members.get(memberId);
    }

    // Method to remove a member (optional)
    public boolean removeMember(int memberId) {
        if (members.containsKey(memberId)) {
            members.remove(memberId);
            return true;
        }
        return false;
    }

    // List all members
    public void listAllMembers() {
        members.values().forEach(member -> System.out.println(member.toString()));
    }
}