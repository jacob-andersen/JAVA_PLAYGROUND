public class WaveGenerator {

    static String specChar = " _";
    
    public static void main(String[] args) {
        String text = "";
        String[] newString = text.split("[_ ]");
        System.out.println(newString.length);

        // split the string by delimiter into array of strings
        // make string all lowercase
        // use index inside each separate string
        // start with empty string
        // if traversal index equals provided index, uppercase and add character
        // else just add original character
        
        String[] result = wave(text);
        for (String elem : result) {
            System.out.print(elem + " ");
        }
    }


        public static String[] wave(String str) {

            int length = str.replaceAll("[_ ]","").length();
            String[] line=new String[length];
    
            for (int i = 0; i<line.length;i++)
            {
                    line[i] = createWave(str, i);
            }
            return line;
        }
    
        public static String createWave(String wavestring, int index)
        {
            char[] arr = wavestring.toLowerCase().toCharArray();
            for (int j=0;j<wavestring.length();j++) {
                if (specChar.indexOf(arr[j]) == -1) {
                    if (index == 0) {
                        arr[j] = Character.toUpperCase(arr[j]);
                        break;
                    } else {
                        index--;
                    }
                }
            }
        return new String(arr);
    }
}