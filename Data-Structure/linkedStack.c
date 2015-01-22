typedef struct StackNode
{
	SElementType data;
	struct StackNode *next;
}StackNode, *LinkStackPtr;

typedef struct 
{
	LinkStackPtr Top;
	int count;
}LinkStack;

Status Push(LinkStack * S, SElementType ele)
{
	LinkStackPtr top = (LinkStackPtr)malloc(sizeof(StackNode)); //you should assign it as a pointer
	top->data = ele;
	top->next = S->Top;
	S->Top = top;
	S->count++;
	return OK;
}

Status Pop(LinkStack * S, SElementType * e)
{
	//if (S->Top == NULL) return ERROR;
	//This statement is not proper, you should consider the count
	
	if ( StackEmpty(*s) )
		return ERROR;
	LinkStackPtr newTop = S->Top->next;
	*e = S->Top->data;
	free(S->Top);
	S->Top = newTop;
	S->count--;
	return OK;
}
	

