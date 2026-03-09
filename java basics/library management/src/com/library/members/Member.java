package com.library.members;

public class Member {

        private void checkId() {
            System.out.println("checked member ID");
        }

        private void checkMembershipStatus() {
            System.out.println("Checking membership status");
        }

        public void registerMember() {
            checkId();
            checkMembershipStatus();
            System.out.println("registered");
        }

    }
