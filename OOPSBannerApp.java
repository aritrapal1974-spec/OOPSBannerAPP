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
}
