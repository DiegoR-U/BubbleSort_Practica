public class BubbleSort
{
    public void bubbleSort(int[] vet)
    {
        int aux;

        for (int i = vet.length - 1; i >= 1; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (vet[j] > vet[j + 1])
                {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
    }
}