package com.xworkz.comaparatorandcomparable.dto;


import lombok.*;

@EqualsAndHashCode
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public   class BankDTO implements Comparable<BankDTO>
{
    private String name;
    private int accountBalance;


    public int compareTo(BankDTO that) {
        if (this.getAccountBalance() > that.getAccountBalance()) {
            return 1;
        } else if (this.getAccountBalance() < that.getAccountBalance()) {
            return -1;
        } else {
            return 0;
        }
    }
}
