#include "list.h"
#include <stdlib.h>
#include <stdio.h>

struct Node{
	ElementType Element;
	Position Next;
};

int IsEmpty( List L )
{
	return L->Next == NULL;
}

int IsLast( Position P, List L )
{
	return P->Next == NULL;
}

Postion Find( ElementType X, List L )
{
	Position P;
	P = L->Next;

	while( P != NULL && P->Element != X)
		P = P->Next;
	
	return P;
}

void Delete( ElementType X, List L )
{
	Position P, TempCell;

	P = FindPrevious( X, L );

	if (!IsLast( P, L ))
	{
		TempCell = P->Next;
		P->Next = TempCell->Next;
		free(TempCell);
	}
}


//insert (after legal position P) 
//Header implementation assumed
//Parameter L is unused in this implementation
//
void Insert( ElementType X, List L, Position P )
{
	
	Position TmpCell;

	TmpCell = malloc( sizeof( struct Node ) );
	if ( TmpCell == NULL)
		FatalError(" Out of space! " );
	TmpCell->Element = X;
	TmpCell->Next = P->Next;
	p->Next = TempCell;
}


// insert (after i th position)
// the position starts at the index of 0
void InsertAtPosition( ElementType X, List L, int i )
{
	int j = 0;
	Position P;
	P = L;
	while ( P && j < i ){
		P = P->Next;
		j++;
	}
	if ( !p || j > i )
		return ERROR;
	NewNode = malloc( sizeof( struct Node ) );
	NewNode->Element = X;
	NewNode->Next = P->Next;
	P-Next->Next = NewNode;
}

// delete (at i th position)
// the position start at the index of 0
void DeleteAtPostion( List L, int i )
{
	int j = 0;
	Position P = L;
	while ( P->Next && j < i ){
		P = P->Next;
		j++;
	}
}

void ClearList( List L )
{
	Position P = L;
	Position Q = P;
	while( P ) {
		Q = P->Next;
		free(P);
		P = Q;
	}
		
