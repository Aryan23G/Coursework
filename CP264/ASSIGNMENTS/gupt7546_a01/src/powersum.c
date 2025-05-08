/*
--------------------------------------------------
Project: a1q2
File:    mycase.h
Author:  Aryan Gpta
Version: 2025-01-14
--------------------------------------------------
*/

#include "powersum.h"
#include <limits.h> 

int power_overflow(int b, int n) {
    
    if (n < 0) {
        
        return 1;
    }
    if (b == 0 && n > 0) {
        return 0; 
    }
    if (b == 0 && n == 0) {
        return 0; 
    }
    if (n == 0) {
        return 0; 
    }

    int result = 1;

    for (int i = 1; i <= n; i++) {
       
        if (b != 0 && result > INT_MAX / b) {
            return 1; 
        }
        result *= b;
    }

    return 0; 
}

int mypower(int b, int n) {
    if (power_overflow(b, n)) {
        return 0; 
    }
    int result = 1;
    for (int i = 0; i < n; i++) {
        result *= b;
    }
    return result;
}

int powersum(int b, int n) {
    int sum = 0;
    int power = 1; 

    for (int i = 0; i <= n; i++) {
        
        if (sum > INT_MAX - power) {
            return 0; 
        }
        sum += power;

        
        if (i < n) {
            if (power_overflow(b, i + 1)) {
                return 0; 
            }
            power *= b; 
        }
    }

    return sum;
}
