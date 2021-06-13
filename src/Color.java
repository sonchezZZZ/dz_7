public enum Color {

    RED(255, 140, 0),
    GREEN("#8A2BE2"),
    BLUE("#00d3ff"),
    WHITE("#ffffff"),
    BLACK("#000000");
    private String hex;
    private int r;
    private int g;
    private int b;

    Color(String hex) {
        this.hex = hex;
        this.r = Integer.parseInt(hex.substring(1, 3), 16);
        this.g = Integer.parseInt(hex.substring(3, 5), 16);
        this.b = Integer.parseInt(hex.substring(5), 16);
    }

    Color(int r, int g, int b) {
        this.r = r;
        this.b = b;
        this.g = g;
        this.hex = "";
        int[] colors = new int[]{r, g, b};
        for (int i : colors) {
            if (i > 9) {
                this.hex += Integer.toHexString(i);
            } else {
                this.hex += "0";
                this.hex += Integer.toHexString(i);
            }
        }
    }

    public String getHex() {
        return hex;
    }

    public String getRgb() {
        String rgb = Integer.toString(r) + "," + Integer.toString(g) + "," + Integer.toString(b);
        return rgb;
    }
}
