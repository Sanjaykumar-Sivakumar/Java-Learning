class VC
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String WithoutV = s.replaceAll("[aeiouAEIOU]", " ");
        int vowelsCount = s.length() - WithoutV.length();
        int consonantCount = s.replaceAll("[^a-zA-Z]"," ".length());
    }
}