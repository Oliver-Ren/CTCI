#define MAXSIZE 100

typedef struct
{
	ElementType data[MAXSIZE];
	int head;
	int tail;
}SqQueue;

//initiallize
Status InitQueue(SqQueue *Q)
{
	Q->head = 0;
	Q->tail = 0;
	return OK;
}

Status Enqueue(SqQueue *Q, ElementType ele)
{
	//Judge if the queue is full
	if ((Q->tail + 1 % MAXSIZE) == Q->head) 
		return ERROR;
	Q->data[Q->tail] = ele; //This should be at the first because pointer already points to the empty section.
	Q->tail = (Q->tail + 1) % MAXSIZE;
	return OK;
}

Status Dequeue(SqQueue * Q, ElementType * ele)
{
	//Judge if the queue is empty
	if ( Empty(Q) ) return ERROR;
	*ele = Q->data[Q->head++]; //could not implement using the simple ++, because the queue is cyclic
	return OK;
}

int Empty(SqQueue * Q)
{
	if ( Q->head == Q->tail ) return 1;
	else return 0;
}

