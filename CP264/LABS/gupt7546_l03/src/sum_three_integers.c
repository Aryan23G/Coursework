/**
 * -------------------------------------
 * @file  functions.c
 * Lab 2 Functions Source Code File
 * -------------------------------------
 * @author Aryan Gupta, 169 057 546, gupt7546@mylaurier.ca
 *
 * @version 2025-01-06
 *
 * -------------------------------------
 */
#include "functions.h"

int sum_three_integers(void) {

   int num1;
	int num2;
	int num3;
	int sum;

	char line[STRING_SMALL];
	printf("Enter three integers seperated by commas: ");
	while (fgets(line, sizeof(line), stdin)) {
		if (sscanf(line, "%d, %d, %d", &num1, &num2, &num3) == 3) {
			sum = num1 + num2 + num3;
			break;
		}
		else {
			printf("The integers were not properly entered \n");
			printf("Enter three comma-separated integers: ");
		}
	}
	return sum;

}