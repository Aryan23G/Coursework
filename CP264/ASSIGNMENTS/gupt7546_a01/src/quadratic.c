/*
--------------------------------------------------
Project: a1q3
File:    mycase.h
Author:  Aryan Gpta
Version: 2025-01-15
--------------------------------------------------
*/
#include "quadratic.h"
#include <math.h>
#define EPSILON 1e-6

int solution_type(float a, float b, float c)
{
    int t = -1;
    if (fabs(a) < EPSILON)
        t = 0;
    else
    {
      float discriminant = b * b - 4 * a * c;
        if (discriminant > EPSILON) {
            t = 2; 
        } else if (fabs(discriminant) < EPSILON) {
            t = 1; 
        } else {
            t = 3; 
        }
    }

    return t;
}

float real_root_big(float a, float b, float c)
{
    int t = solution_type(a, b, c);
    if (t == 1) {
        
        return -b / (2 * a);
    } else if (t == 2) {
        
        float discriminant = sqrt(b * b - 4 * a * c);
        return (-b + discriminant) / (2 * a);
    }
    return 0; 
}

float real_root_small(float a, float b, float c)
{
    int t = solution_type(a, b, c);
    if (t == 1) {
      
        return -b / (2 * a);
    } else if (t == 2) {
       
        float discriminant = sqrt(b * b - 4 * a * c);
        return (-b - discriminant) / (2 * a);
    }
    return 0; 
}