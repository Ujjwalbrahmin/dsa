from typing import List


class Solution:
    @staticmethod
    def num_unique_emails(emails: List[str]) -> int:
        valid_emails = {}

        for email in emails:
            components = email.split('@')
            local, domain = components[0], components[1]
            l_components = local.split("+")
            valid_emails[l_components[0].replace(".", "") + "@" + domain] = 1

        return len(valid_emails.keys())


if __name__ == '__main__':
    inputs = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
    output = Solution.num_unique_emails(inputs)
    print(output)
