/**
 * -------------------------------------
 * @file  sum_integers.c
 * Lab 3 Source Code File
 * -------------------------------------
 * @author Aryan Gupta, 169 057 546, gupt7546@mylaurier.ca
 *
 * @version 2025-01-06
 *
 * -------------------------------------
 */
#include "functions.h"

int sum_integers(void) {

   char line[STRING_SMALL];
	int num = 0;
	int sum = 0;

	printf("Enter one integer per line: ");
	while (fgets(line, sizeof(line), stdin)) {
		if (sscanf(line, "%d", &num) == 1) {
			sum += num;
		}
		else {
			break;
		}
	}
	return sum;

}