public class OOPSBannerApp {
    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for character pattern.
         *
         * @return 7-line banner pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    // ===== Utility Methods to Create Patterns =====

    /**
     * Creates O pattern.
     */
    public static CharacterPatternMap createOPattern() {
        return new CharacterPatternMap('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });
    }

    /**
     * Creates P pattern.
     */
    public static CharacterPatternMap createPPattern() {
        return new CharacterPatternMap('P', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                "  *****  ",
                " *       ",
                " *       ",
                " *       "
        });
    }

    /**
     * Creates S pattern.
     */
    public static CharacterPatternMap createSPattern() {
        return new CharacterPatternMap('S', new String[]{
                "  *****  ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        });
    }

    // ===== Main Method =====

    public static void main(String[] args) {

<<<<<<< HEAD
        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("   ", o[i], o[i], p[i], s[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // ===== O Pattern =====
    public static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };
    }

    // ===== P Pattern =====
    public static String[] getPPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                "  *****  ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    // ===== S Pattern =====
    public static String[] getSPattern() {
        return new String[]{
                "  *****  ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        };
    }
=======
        // Array of CharacterPatternMap objects
        CharacterPatternMap[] characters = {
                createOPattern(),
                createOPattern(),
                createPPattern(),
                createSPattern()
        };

        // Render banner using StringBuilder
        for (int row = 0; row < 7; row++) {
            StringBuilder lineBuilder = new StringBuilder();

            for (CharacterPatternMap cp : characters) {
                lineBuilder.append(cp.getPattern()[row]).append("   ");
            }

            System.out.println(lineBuilder);
        }
    }
>>>>>>> ae4bb900d1b543fc67f79165b63500030fdb51f3
}
