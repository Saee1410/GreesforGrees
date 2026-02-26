




public class spiral {
    public static void printSpiral(int matrix[][]){
        if (matrix == null || matrix.length == 0) {
            return;
        }

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        // जोपर्यंत boundaries एकमेकांना ओलांडत नाहीत, तोपर्यंत लूप चालवा
        while (startRow <= endRow && startCol <= endCol) {
            
            // 1. TOP Boundary (डावीकडून उजवीकडे - Left to Right)
            // Row स्थिर (startRow), Column बदलतोय (j)
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // 2. RIGHT Boundary (वरून खाली - Top to Bottom)
            // Column स्थिर (endCol), Row बदलतोय (i)
            // startRow + 1 पासून सुरू करा कारण कोपऱ्याचा नंबर आधीच प्रिंट झालाय
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // 3. BOTTOM Boundary (उजवीकडून डावीकडे - Right to Left)
            // Row स्थिर (endRow), Column बदलतोय (j)
            for (int j = endCol - 1; j >= startCol; j--) {
                // जर मॅट्रिक्समध्ये फक्त एकच Row उरली असेल, तर ती पुन्हा प्रिंट होऊ नये
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // 4. LEFT Boundary (खालून वर - Bottom to Top)
            // Column स्थिर (startCol), Row बदलतोय (i)
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                // जर मॅट्रिक्समध्ये फक्त एकच Column उरला असेल, तर तो पुन्हा प्रिंट होऊ नये
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            // एक राऊंड पूर्ण झाल्यावर भिंती आत सरकवा
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println(); // नवीन ओळ
    }

    public static void main(String[] args){
       int matrix[] [] = {{1, 2, 3}, 
                           {4, 5, 6},
                           {7, 8, 9}
                            };
      printSpiral(matrix);
    }
}
