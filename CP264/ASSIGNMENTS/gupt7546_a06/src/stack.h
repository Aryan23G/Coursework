/*
--------------------------------------------------
Project: a6
File:    stack.h
Author:  Aryan Gupta
Version: 2025-02-25
--------------------------------------------------
*/  
#ifndef STACK_H
#define STACK_H
#include "common.h"

typedef struct stack {
  int length;
  NODE *top;
} STACK;

void push(STACK *sp, NODE *np);
NODE *pop(STACK *sp);
void clean_stack(STACK *sp);

#endif