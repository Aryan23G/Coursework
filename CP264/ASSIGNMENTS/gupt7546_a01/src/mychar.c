/*
--------------------------------------------------
Project: a1q1
File:    mycase.h
Author:  Aryan Gpta
Version: 2025-01-13
--------------------------------------------------
*/
#include "mychar.h"


int mytype(char c) {
    
    if (c >= '0' && c <= '9') {
        return 0; 
    } else if (c == '+' || c == '-' || c == '*' || c == '/') {
        return 1; 
    } else if (c == '(') {
        return 2; 
    } else if (c == ')') {
        return 3; 
    } else if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
        return 4; 
    } else {
        return -1; 
    }
}


char case_flip(char c) {
    if (c >= 'A' && c <= 'Z') {
        return c + ('a' - 'A'); 
    } else if (c >= 'a' && c <= 'z') {
        return c - ('a' - 'A'); 
    } else {
        return c; 
    }
}


int digit_to_int(char c){
    if (c >= '0' && c <= '9') {
        return c - '0'; 
    } else {
        return -1; 
    }
}