/*
--------------------------------------------------
Project: a2q3
File:    polynomial.h
Author:  Aryan Gupta
Version: 2025-01-16
--------------------------------------------------
*/
#ifndef POLYNOMIAL_H
#define POLYNOMIAL_H
 
float horner(float *p, int n, float x);

void derivative(float *p, float *d, int n);

float newton(float *p, int n, float x0);

#endif
