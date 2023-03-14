class ToyClassificationApplication{
    public static void main(String[] args){
    int[][] sides = {
    {3, 4, 5},
    {2, 3, 4},
    {5, 12, 13},
    {19, 19, 19},
    {9, 40, 41}
    };

    // your code
    /*System.out.println("("+sides[0][0]+", "+sides[0][1]+", "+sides[0][2]+") is right-angled");
    System.out.println("("+sides[1][0]+", "+sides[1][1]+", "+sides[1][2]+") is not right-angled");
    System.out.println("("+sides[2][0]+", "+sides[2][1]+", "+sides[2][2]+") is right-angled");
    System.out.println("("+sides[3][0]+", "+sides[3][1]+", "+sides[3][2]+") is not right-angled");
    System.out.println("("+sides[4][0]+", "+sides[4][1]+", "+sides[4][2]+") is right-angled");*/

    for(int i=0; i<5; i++){
        if(sides[i][2] * sides[i][2] == sides[i][0] * sides[i][0] + sides[i][1] * sides[i][1]){
            System.out.println("("+sides[i][0]+", "+sides[i][1]+", "+sides[i][2]+") is right-angled");
        } else {
            System.out.println("("+sides[i][0]+", "+sides[i][1]+", "+sides[i][2]+") is not right-angled");
        }
    }

    }
   }