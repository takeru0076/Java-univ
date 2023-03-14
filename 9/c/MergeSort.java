class MergeSort implements Strategy{
    @Override
    public void sort(int[] data){
        if( data.length <= 1 )
        {
            // 要素数が１以下なら何もしません。
            return;
        }
        int leftSize = data.length / 2;
        int rightSize = data.length - leftSize;
        int[] leftdata = new int[leftSize];
        int[] rightdata = new int[rightSize];
        int iF1;
        for( iF1 = 0; iF1 < leftSize; ++iF1 )
        {
            leftdata[iF1] = data[iF1];
        }
        
        for( iF1 = 0; iF1 < rightSize; ++iF1 )
        {
            rightdata[iF1] = data[leftSize + iF1];
        }

        sort( leftdata );
        sort( rightdata );

        int leftPos = 0;
        int rightPos = 0;
        while(
            ( leftPos  < leftSize  ) || 
            ( rightPos < rightSize )
            )
        {
            if( rightSize <= rightPos )
            {
                data[leftPos + rightPos] = leftdata[leftPos];
                ++leftPos;
            }
            else if( leftSize <= leftPos )
            {
                data[leftPos + rightPos] = rightdata[rightPos];
                ++rightPos;
            }
            else if( leftdata[leftPos] > rightdata[rightPos] )
              {
                data[leftPos + rightPos] = rightdata[rightPos];
                ++rightPos;
              }
              else
            {
                data[leftPos + rightPos] = leftdata[leftPos];
                ++leftPos;
            }
        }
    }
}