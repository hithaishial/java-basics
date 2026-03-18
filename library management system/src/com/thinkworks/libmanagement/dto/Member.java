package com.thinkworks.libmanagement.dto;

public class Member {

    private String memberId;
    private String name;
    private String email;
    private MembershipType membershipType;

    public enum MembershipType{

        REGULAR, PREMIUM, STUDENT;
    }

    public Member(String memberId, String name, String email, MembershipType membershipType){

        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.membershipType = membershipType;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

}
