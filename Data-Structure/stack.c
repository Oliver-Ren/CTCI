// this is the implementation of the stack of the dahua book

#define MAXSIZE 20;	

typedef int SElemType;
typedef struct
{
	ElemType data[MAXSIZE];
	int top;
}sqStack;

Status Push(sqStack * stack, SElemType ele)
{
	if (stack->top >= MAXSIZE-1){
		return ERROR;
	}
	stack->top++;
       	stack->data[stack->top] = ele;
	return OK;
}

Status Pop(sqStack * stack, SElemtype * ele)
{
	if (stack->top == -1)
	{
		return ERROR;
	}
	*ele = stack->data[stack->top--];	
	return OK;
}

// Two stacks share the space
typedef struct 
{
	SElemType data[MAXSIZE];
	int top1;
	int top2;
}SqdoubleStack;

Status Push( SqdoubleStack * S, SElemType e, int stackNumber)
{
	if (S->top1 + 1 == S->top2) return ERROR;
	if (stackNumber == 1)
		S->data[++S->top1];
	else if (stackNumber == 2)
		S->data[--S->top2];
	return OK;
}

Status Pop(SqdoubleStack * S, ElemType * e,int stackNumber)
{
	if (stackNumber == 1)
	{
		if (S->top1 == -1)    //care this is -1
			return ERROR;
		*e = S->data[top1--];
	}
	else if (stackNumber == 2)
	{
		if (S->top2 == MAXSIZE)
			return ERROR;
		*e = S->data[top2++];
	}
	return OK;
}

