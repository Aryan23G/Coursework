/*
--------------------------------------------------
Project: a6
File:    expression.h
Author:  Aryan Gupta
Version: 2025-02-25
--------------------------------------------------
*/  
#ifndef EXPRESSION_H
#define EXPRESSION_H

#include "common.h"
#include "queue.h"

QUEUE infix_to_postfix(char *infixstr);

int evaluate_postfix(QUEUE queue);

int evaluate_infix(char *infixstr);

#endif